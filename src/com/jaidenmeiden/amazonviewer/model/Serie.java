package com.jaidenmeiden.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film {

    private int id;
    private int seasonQuantity;
    private ArrayList<Chapter> chapters;

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

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }
    
    
    
    public static ArrayList<Serie> makeSeriesList() {
        ArrayList<Serie> series = new ArrayList<>();

        for(int i = 1; i <= 7; i++) {
        	Serie serie = new Serie("Serie " + i, "Genre " + i, "Creator " + i, 120 + i, (short)(1990 + 1));
            serie.setChapters(Chapter.makeChaptersList(serie));
			series.add(serie);
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

	@Override
	public void view() {
		setViewed(true);
	}
}
