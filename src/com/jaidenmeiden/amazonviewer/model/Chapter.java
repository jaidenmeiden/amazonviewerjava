package com.jaidenmeiden.amazonviewer.model;

public class Chapter {

    private int id;

    private String title;

    private int dutation;

    private short year;

    private boolean viewed;

    private int timeViewed;

    private int sessionNumber;

    public Chapter(String title, int dutation, short year) {
        this.title = title;
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

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
}
