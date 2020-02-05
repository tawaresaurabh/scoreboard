package com.example.scoreboard.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PlayerRecord {



    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="player_name")
    private String playerName;

    public PlayerRecord() {
    }

    @Column(name="points")
    private int points;

    public PlayerRecord(String playerName, int points) {
        this.playerName = playerName;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


}
