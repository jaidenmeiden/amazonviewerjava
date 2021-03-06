package com.jaidenmeiden.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Hereda de {@link Film}
 * Implementa de {@link IVisualizable}
 * */
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

    public static ArrayList<Movie> makeMoviesList() {
        ArrayList<Movie> movies = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            movies.add(new Movie("Movie " + i, "Genre " + i, "Creator " + i, 120 + i, (short)(1990 + i)));
        }

        return movies;
    }

    /**
	 * {@inheritDoc}
	 * */
    @Override
    public String toString() {
        return "Title: " + super.getTitle() +
        "\nGenre: " + super.getGenre() +
        "\nYear: " + super.getYear() +
        "\nCreator: " + super.getCreator() +
        "\nDuration: " + super.getDuration();
    }

    /**
	 * {@inheritDoc}
	 * */
    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    /**
	 * {@inheritDoc}
	 * */
    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if(dateF.getTime() > dateI.getTime()) {
            this.setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
        } else {
            this.setTimeViewed(0);
        }
    }

    /**
	 * {@inheritDoc}
	 * */
	@Override
	public void view() {
		// TODO Auto-generated method stub
		setViewed(true);
		Date dateI = startToSee(new Date());
		
		for (int i = 0; i < 100000; i++) {
			System.out.println("..........");
		}
		
		//Termine de verla
		stopToSee(dateI, new Date());
		System.out.println();
		System.out.println("Viste: " + toString());
		System.out.println("Por: " + getTimeViewed() + " milisegundos");
	}
}
