package me.grpc.service;

import io.grpc.stub.StreamObserver;
import me.grpc.stubs.GameGrpc;
import me.grpc.stubs.GameOuterClass;

import java.util.Random;

public class GameImpl extends GameGrpc.GameImplBase {
    private final int secretNumber;
    private int lastWinner = -1;
    private boolean gameEnded = false;

    public GameImpl() {
        Random random = new Random();
        secretNumber = random.nextInt(1000) + 1;
        System.out.println("secret number is "+secretNumber);
    }

    @Override
    public void guess(GameOuterClass.GuessRequest request, StreamObserver<GameOuterClass.GuessResponse> responseObserver) {
        if (gameEnded) {
            responseObserver.onError(new RuntimeException("Le jeu est terminé"));
            return;
        }

        int guess = request.getGuess();
        if (guess == secretNumber) {
            lastWinner = 1;
            gameEnded = true;
            responseObserver.onNext(GameOuterClass.GuessResponse.newBuilder().setMessage("BRAVO vous avez gagné").build());
        } else if (guess < secretNumber) {
            responseObserver.onNext(GameOuterClass.GuessResponse.newBuilder().setMessage("Votre nombre est plus petit").build());
        } else {
            responseObserver.onNext(GameOuterClass.GuessResponse.newBuilder().setMessage("Votre nombre est plus grand").build());
        }

        responseObserver.onCompleted();
    }

    @Override
    public void getWinner(GameOuterClass.WinnerRequest request, StreamObserver<GameOuterClass.WinnerResponse> responseObserver) {
        if (!gameEnded) {
            responseObserver.onError(new RuntimeException("Le jeu n'est pas encore terminé"));
            return;
        }

        String winner = lastWinner == 1 ? "Client 1" : "Client 2";
        responseObserver.onNext(GameOuterClass.WinnerResponse.newBuilder().setWinner(winner).build());
        responseObserver.onCompleted();
    }
}
