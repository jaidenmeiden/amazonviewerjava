package com.jaidenmeiden.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Chapter extends Movie {

    private int id;
    private int sessionNumber;
    private Serie serie;

    public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber, Serie serie) {
        super(title, genre, creator, duration, year);
        this.sessionNumber = sessionNumber;
        this.setSerie(serie);
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
    
    public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
    
    public static ArrayList<Chapter> makeChaptersList(Serie serie) {
        ArrayList<Chapter> chapters = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
        	chapters.add(new Chapter("Chapter " + i, "Genre " + i, "Creator " + i, 120 + i, (short)(2000 + i), i, serie));
        }

        return chapters;
    }
    
    @Override
	public void view() {
		// TODO Auto-generated method stub
		super.view();
		ArrayList<Chapter> chapters =  getSerie().getChapters();
		int chapterViewedCounter = 0;
		for (Chapter chapter : chapters) {
			if (chapter.getIsViewed()) {
				chapterViewedCounter++;
			}
		}
		
		if (chapterViewedCounter == chapters.size()) {
			getSerie().view();
		}
	}

}
