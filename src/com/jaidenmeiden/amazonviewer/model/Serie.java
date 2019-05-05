package com.jaidenmeiden.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film {

    private int id;
    private int seasonQuantity;
    private ArrayList<Chapter> charpters;

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

    public ArrayList<Chapter> getCharpters() {
        return charpters;
    }

    public void setCharpters(ArrayList<Chapter> charpters) {
        this.charpters = charpters;
    }
    
    public static ArrayList<Serie> makeSeriesList() {
        ArrayList<Serie> series = new ArrayList<>();

        for(int i = 1; i < 10; i++) {
            series.add(new Serie("Serie " + i, "Genre " + i, "Creator " + i, 120 + i, (short)(1990 + 1)));
        }

        return series;
    }
    
    @Override
    public String toString() {
        return "Title: " + super.getTitle() +
        "\nGenre: " + super.getGenre() +
        "\nYear: " + super.getYear() +
        "\nCreator: " + super.getCreator() +
        "\nDuration: " + super.getDuration();
    }
}
