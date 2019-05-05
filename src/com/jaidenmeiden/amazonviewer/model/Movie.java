package com.jaidenmeiden.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class Movie extends Film implements IVisualizable{

    private int id;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        super.setYear(year);
    }

    public int getId() {
        return id;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "Title: " + super.getTitle() +
        "\nGenre: " + super.getGenre() +
        "\nYear: " + super.getYear() +
        "\nCreator: " + super.getCreator() +
        "\nDuration: " + super.getDuration();
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if(dateF.getTime() > dateI.getTime()) {
            this.setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
        } else {
            this.setTimeViewed(0);
        }
    }

    public static ArrayList<Movie> makeMoviesList() {
        ArrayList<Movie> movies = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            movies.add(new Movie("Movie " + i, "Genre " + i, "Creator " + i, 120 + i, (short)(1990 + i)));
        }

        return movies;
    }
}
