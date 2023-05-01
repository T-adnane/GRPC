import chat.ChatServiceGrpc;
import chat.Serverchat;
import com.example.grpc.chat.server.ChatMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChatServiceImpl extends ChatServiceGrpc.ChatServiceImplBase {

    private final Map<String, List<StreamObserver<Serverchat.ChatMessage>>> rooms = new ConcurrentHashMap<>();

    @Override
    public void joinRoom(Serverchat.JoinRequest request, StreamObserver<Serverchat.ChatMessage> responseObserver) {
        String room = request.getRoom();
        List<StreamObserver<Serverchat.ChatMessage>> observers = rooms.computeIfAbsent(room, k -> new ArrayList<>());
        observers.add(responseObserver);
        notifyRoom(room, ChatMessage.newBuilder()
                .setField(message)
                .setMessage(request.getName() + " joined the room.")
                .build());
    }

    @Override
    public void sendMessage(ChatMessage request, StreamObserver<Empty> responseObserver) {
        String room = request.getMessageText();
        notifyRoom(room, request);
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    private void notifyRoom(String room, ChatMessage message) {
        List<StreamObserver<Serverchat.ChatMessage>> observers = rooms.get(room);
        if (observers != null) {
            observers.forEach(observer -> observer.onNext(Serverchat.ChatMessage.newBuilder().build()));
        }
    }
}
