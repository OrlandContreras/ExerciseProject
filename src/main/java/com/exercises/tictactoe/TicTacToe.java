package com.exercises.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {
    public static void main(String[] args) throws IOException {

        Player[] players = new Player[2];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el nick para el jugador #1: ");
        String player1 = reader.readLine();
        players[0] = new Player(player1, 'X');

        System.out.println("Ingrese el nick para el jugador #2: ");
        String player2 = reader.readLine();
        players[1] = new Player(player2, 'O');

        Game game = new Game(players);

        boolean play = true;
        short player = 0;
        short x, y;

        while(play) {
            System.out.println("Juega el jugador " + players[player].getNickname());
            System.out.println("Ingrese la posicion en x: ");
            x = Short.parseShort(reader.readLine());
            System.out.println("Ingrese la posicion en y: ");
            y = Short.parseShort(reader.readLine());
            play = game.play((short) x, (short) y, (short) player);
            game.showGame();
            if( player == 0) {
                player = 1;
            }else {
                player = 0;
            }
        }


    }
}
