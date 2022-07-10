package com.exercises.tictactoe;

import java.util.Arrays;

public class Game {
    private char[][] ticTacToe = new char[3][3];
    private Player[] players = new Player[2];

    public char[][] getTicTacToe() {
        return ticTacToe;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Game(Player[] players) {
        this.players = players;
        Initializer();
    }

    private void Initializer() {
        for (short i = 0; i < this.ticTacToe.length ; i++) {
            for (short j = 0; j < this.ticTacToe.length; j++) {
                this.ticTacToe[i][j] = '_';
            }
        }
    }

    public boolean play(short x, short y, short player) {
        this.ticTacToe[x][y] = this.players[player].getDraw();
        for (short i = 0; i < this.ticTacToe.length; i++) {
            for (short j = 0; j < this.ticTacToe.length; j++) {
                if (this.ticTacToe[i][j] == '_') {
                    return true;
                }
            }
        }
        return false;
    }

    public void showGame() {
        for (short i = 0; i < this.ticTacToe.length ; i++) {
            System.out.println("");
            for (short j = 0; j < this.ticTacToe.length; j++) {
                System.out.print(this.ticTacToe[i][j] + " ");
            }
        }
        System.out.println("");
    }

    // TODO: Verify and Refactor method. Wrong functional
    public void showWin() {

        // Validate Verticals
        for (short i = 0; i < this.ticTacToe.length; i++) {
            if(this.ticTacToe[i][0] == 'X' && this.ticTacToe[i][1] == 'X' && this.ticTacToe[i][2] == 'X') {
                System.out.println("El ganador es el jugador: " + this.players[0]);
            }else {
                System.out.println("El ganador es el jugador: " + this.players[1]);
            }
        }

        // Validate Horizontals
        for (short j = 0; j < this.ticTacToe.length; j++) {
            if(this.ticTacToe[0][j] == 'X' && this.ticTacToe[1][j] == 'X' && this.ticTacToe[2][j] == 'X') {
                System.out.println("El ganador es el jugador: " + this.players[0]);
            }else {
                System.out.println("El ganador es el jugador: " + this.players[1]);
            }
        }

        // Validate Diagonal Right
        for (short i = 0; i < this.ticTacToe.length; i++) {
            if(this.ticTacToe[i][i] == 'X' && this.ticTacToe[i][i] == 'X' && this.ticTacToe[i][i] == 'X') {
                System.out.println("El ganador es el jugador: " + this.players[0]);
            }else {
                System.out.println("El ganador es el jugador: " + this.players[1]);
            }
        }

        // Validate Diagonal Right
        for (short i = (short) ((short) this.ticTacToe.length - 1); i > 0; i--) {
            if(this.ticTacToe[i][i+2] == 'X' && this.ticTacToe[i][i+2] == 'X' && this.ticTacToe[i][i+2] == 'X') {
                System.out.println("El ganador es el jugador: " + this.players[0]);
            }else {
                System.out.println("El ganador es el jugador: " + this.players[1]);
            }
        }
    }
}
