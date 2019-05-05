package com.jaidenmeiden.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Chapter extends Movie {

    private int id;
    private int sessionNumber;

    public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
        super(title, genre, creator, duration, year);
        this.sessionNumber = sessionNumber;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
    
    public static ArrayList<Chapter> makeChaptersList() {
        ArrayList<Chapter> chapters = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
        	chapters.add(new Chapter("Chapter " + i, "Genre " + i, "Creator " + i, 120 + i, (short)(2000 + i), i));
        }

        return chapters;
    }

}
