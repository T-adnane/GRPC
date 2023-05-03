package me.grpc.service;

import me.grpc.stubs.ChatServiceGrpc;

import com.google.protobuf.Timestamp;
import me.grpc.stubs.ChatServiceGrpc;
import me.grpc.stubs.Serverchat;
import io.grpc.stub.StreamObserver;

import java.util.LinkedHashSet;

public class ChatServiceImpl extends ChatServiceGrpc.ChatServiceImplBase {

    private static LinkedHashSet<StreamObserver<Serverchat.ChatMessageFromServer>>
            observers = new LinkedHashSet<>();

    @Override
    public StreamObserver<Serverchat.ChatMessage> sendChatMessage(StreamObserver<Serverchat.ChatMessageFromServer> responseObserver) {
        // Add response observer to the list
        observers.add(responseObserver);

        // Handler for client messages
        return new StreamObserver<Serverchat.ChatMessage>() {

            @Override
            public void onNext(Serverchat.ChatMessage value) {

                System.out.println(value);

                // Create a server message from the client message
                Timestamp timestamp = Timestamp.newBuilder()
                        .setSeconds(System.currentTimeMillis())
                        .build();

                Serverchat.ChatMessageFromServer message = Serverchat.ChatMessageFromServer
                        .newBuilder()
                        .setMessage(value)
                        .setTimestamp(timestamp)
                        .build();

                // Notify all observers
                for (StreamObserver<Serverchat.ChatMessageFromServer> observer : observers) {
                    observer.onNext(message);
                }
            }

            @Override
            public void onError(Throwable t) {
                t.getMessage();
                observers.remove(responseObserver);
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed!");
//                responseObserver.onCompleted();
//                observers.remove(responseObserver);
            }
        };

    }
}