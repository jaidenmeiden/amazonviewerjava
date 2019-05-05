package com.jaidenmeiden.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable {

    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String isReaded() {
        if(this.readed) {
            return "Si";
        } else {
            return "No";
        }
    }
   
    public boolean getIsReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if(dateF.getTime() > dateI.getTime()) {
            this.setTimeReaded((int)(dateF.getTime() - dateI.getTime()));
        } else {
            this.setTimeReaded(0);
        }
    }
    
    public static ArrayList<Book> makeBooksList() {
        ArrayList<Book> books = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            books.add(new Book("Book " + i, new Date(), "Editorial " + i));
        }

        return books;
    }
}
