package com.jaidenmeiden.amazonviewer.model;

public class Movie {

    private int id;

    private String title;

    private String genre;

    private String creator;

    private int dutation;

    private short year;

    private boolean viewed;

    private int timeViewed;

    public Movie(String title, String genre, short year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public Movie(String title, String genre, String creator, int dutation, short year) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.dutation = dutation;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDutation() {
        return dutation;
    }

    public void setDutation(int dutation) {
        this.dutation = dutation;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
}
