package com.jaidenmeiden.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

import com.jaidenmeiden.amazonviewer.Util.AmazonUtil;

public class Book extends Publication implements IVisualizable {

    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;
    private ArrayList<Page> pages;

    public Book(String title, Date editionDate, String editorial, String[] authors, ArrayList<Page> pages) {
        super(title, editionDate, editorial);
        setAuthors(authors);
        this.pages = pages;
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

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
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
        String[] authors = new String[3];

        for(int i = 0; i < 3; i++) {
            authors[i] = "Author " + i;
        }

        ArrayList<Page> pages = new ArrayList();
        int pagina = 0;
        for(int i = 0; i < 3; i++) {
            pagina = i + 1;
            pages.add(new Book.Page(pagina, "El contenido de la página " + pagina));
        }


        for(int i = 1; i <= 10; i++) {
            books.add(new Book("Book " + i, new Date(), "Editorial " + i, authors, pages));
        }

        return books;
    }

    public void read() {
        // TODO Auto-generated method stub
        setReaded(true);
        Date dateI = startToSee(new Date());

        int i = 0;
        do {
            System.out.println(".......");
            System.out.println("Page" + getPages().get(i).getNumber());
            System.out.println(getPages().get(i).getContent());
            System.out.println(".......");

            if(i != 0) {
                System.out.println("1. Regresar página");
            }
            System.out.println("2. Siguiente página");
            System.out.println("0. Cerrar libro");
            System.out.println();

            int response = AmazonUtil.validateUserResponseMenu(0,2);

            if(response == 2) {
                i++;
            } else if(response == 1) {
                i--;
            } else if(response == 0) {
                break;
            }

        } while(i < getPages().size());

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
