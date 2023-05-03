package me.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import me.grpc.stubs.ChatServiceGrpc;
import me.grpc.stubs.Serverchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class ChatClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        ChatServiceGrpc.ChatServiceStub stub = ChatServiceGrpc.newStub(channel);

        StreamObserver<Serverchat.ChatMessageFromServer> responseObserver = new StreamObserver<Serverchat.ChatMessageFromServer>() {
            @Override
            public void onNext(Serverchat.ChatMessageFromServer message) {
                System.out.println("Received message: " + message.getMessage().getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Server has completed sending messages");
            }
        };

        StreamObserver<Serverchat.ChatMessage> requestObserver = stub.sendChatMessage(responseObserver);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print("Enter message: ");
                String message = reader.readLine();
                if (message == null || message.isEmpty()) {
                    break;
                }
                Serverchat.ChatMessage chatMessage = Serverchat.ChatMessage.newBuilder()
                        .setMessage(message)
                        .build();
                requestObserver.onNext(chatMessage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        requestObserver.onCompleted();

        try {
            channel.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}