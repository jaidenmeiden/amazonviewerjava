package com.jaidenmeiden.amazonviewer.model;

public class Serie extends Film {

    private int id;
    private int seasonQuantity;
    private Chapter charpters;

    public Serie(String title, String genre, String creator, int duration, int seasonQuantity) {
        super(title, genre, creator, duration);
        this.seasonQuantity = seasonQuantity;
    }

    public int getId() {
        return id;
    }

    public int getSeasonQuantity() {
        return seasonQuantity;
    }

    public void setSeasonQuantity(int seasonQuantity) {
        this.seasonQuantity = seasonQuantity;
    }

    public Chapter getCharpters() {
        return charpters;
    }

    public void setCharpters(Chapter charpters) {
        this.charpters = charpters;
    }
}
