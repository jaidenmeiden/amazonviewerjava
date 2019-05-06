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

	public void read() {
		// TODO Auto-generated method stub
		setReaded(true);
        Date dateI = startToSee(new Date());	
        
        for(int i = 1; i < 10000; i++) {
            System.out.println(".......");
        }

        //Termine de verla
        stopToSee(dateI, new Date());
        System.out.println();
        System.out.println("Leiste: " + super.toString());
        System.out.println("Por: " + getTimeReaded() + " milliseconds");
	}

	public static class Page {
        private int id;
        private int number;
        private String content;

        public Page(int number, String content) {
            this.number = number;
            this.content = content;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
