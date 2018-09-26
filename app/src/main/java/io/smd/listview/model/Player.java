package io.smd.listview.model;

public class Player {

    private String playerName;
    private int score;

    public Player(String name, int score){
        this.playerName = name;
        this.score      = score;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



}
