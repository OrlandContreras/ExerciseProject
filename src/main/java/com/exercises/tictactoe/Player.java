package com.exercises.tictactoe;

public class Player {
    private String nickname;
    private char draw;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public char getDraw() {
        return draw;
    }

    public void setDraw(char draw) {
        this.draw = draw;
    }

    public Player(String nickname, char draw) {
        this.nickname = nickname;
        this.draw = draw;
    }
}
