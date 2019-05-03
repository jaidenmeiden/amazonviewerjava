package com.jaidenmeiden.amazonviewer.model;

public class Serie {

    private int id;

    private String title;

    private String genre;

    private String creator;

    private int dutation;

    private short year;

    private boolean viewed;

    private int seasonQuantity;

    private Chapter charpters;

    public Serie() {

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
