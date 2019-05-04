package com.jaidenmeiden.amazonviewer.model;

import java.util.Date;

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
        if(dateF.getSeconds() > dateI.getSeconds()) {
            this.setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
        } else {
            this.setTimeViewed(0);
        }
    }
}
