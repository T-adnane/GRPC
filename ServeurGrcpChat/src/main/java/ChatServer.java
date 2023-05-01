import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ChatServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new ChatServiceImpl())
                .build();

        server.start();
        System.out.println("Server started on port " + server.getPort());

        server.awaitTermination();
    }
}
