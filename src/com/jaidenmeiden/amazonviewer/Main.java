package com.jaidenmeiden.amazonviewer;

import com.jaidenmeiden.amazonviewer.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        int exit = 1;
        do {
            System.out.println("Bienvenidos a Amazon Viewer!");
            System.out.println();
            System.out.println("Selecciona el nùmero de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());
            
            switch (response) {
                case 0:
                    exit = 0;
                    break;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReport(new Date());
                    break;
                default:
                    System.out.println();
                    System.out.println("... ¡¡Selecciona una opción!! ...");
                    System.out.println();
                    break;
            }
        } while (exit != 0);
    }

    public static void showMovies() {
        int exit = 1;
        ArrayList<Movie> movies = Movie.makeMoviesList();
        do {
            System.out.println();
            System.out.println(":: MOVIES ::");
            System.out.println();

            for(int i = 0; i < movies.size(); i++) {
                System.out.println((i+1) + ". Movie: " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
            }
            
            System.out.println();
            System.out.println("Selecciona una pelicula digitando el codigo o");
            System.out.println("digita 0 para regreesar al menú!");
            System.out.println();
            
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());
            
            if(response > 0) {
	            Movie movieSelected = movies.get(response - 1);
	            movieSelected.setViewed(true);
	            Date dateI = movieSelected.startToSee(new Date());	
	            
	            for(int i = 1; i < 10000; i++) {
	                System.out.println(".......");
	            }
	            
	            //Termine de verla
	            movieSelected.stopToSee(dateI, new Date());
	            System.out.println();
	            System.out.println("Viste: " + movieSelected);
	            System.out.println("Viste: " + movieSelected.getTimeViewed() + " milliseconds");
            } else {
            	exit = 0;
            }
            
        } while (exit != 0);
    }

    public static void showSeries() {
        int exit = 1;
        ArrayList<Serie> series = Serie.makeSeriesList();
        do {
            System.out.println();
            System.out.println(":: SERIES ::");
            System.out.println();
            
            for(int i = 0; i < series.size(); i++) {
                System.out.println((i+1) + ". Serie: " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewed());
            }
            
            System.out.println();
            System.out.println("Selecciona una serie digitando el codigo o");
            System.out.println("digita 0 para regreesar al menú!");
            System.out.println();
            
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());
            	
            if(response > 0) {
            	Serie serieSelected = series.get(response - 1);
            	serieSelected.setViewed(true);	
	            
	            for(int i = 1; i < 10000; i++) {
	                System.out.println(".......");
	            }
	            
	            //Termine de verla
	            System.out.println();
	            System.out.println("Viste: " + serieSelected);
            } else {
            	exit = 0;
            }
        } while (exit != 0);
    }

    public static void showChapters() {
        int exit = 1;
        do {
            System.out.println();
            System.out.println(":: CHAPTERS ::");
            System.out.println();
        } while (exit != 0);
    }

    public static void showBooks() {
        int exit = 1;
        ArrayList<Book> books = Book.makeBooksList();
        do {
            System.out.println();
            System.out.println(":: BOOKS ::");
            System.out.println();
            
            for(int i = 0; i < books.size(); i++) {
                System.out.println((i+1) + ". Book: " + books.get(i).getTitle() + " Leido: " + books.get(i).isReaded());
            }
            
            System.out.println();
            System.out.println("Selecciona una serie digitando el codigo o");
            System.out.println("digita 0 para regreesar al menú!");
            System.out.println();
            
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());
            
            if(response > 0) {
            	Book bookSelected = books.get(response - 1);
	            bookSelected.setReaded(true);
	            Date dateI = bookSelected.startToSee(new Date());	
	            
	            for(int i = 1; i < 10000; i++) {
	                System.out.println(".......");
	            }
	            
	            //Termine de verla
	            bookSelected.stopToSee(dateI, new Date());
	            System.out.println();
	            System.out.println("Leiste: " + bookSelected);
	            System.out.println("Por: " + bookSelected.getTimeReaded() + " milliseconds");
            } else {
            	exit = 0;
            }
        } while (exit != 0);
    }

    public static void showMagazines() {
        int exit = 1;
        do {
            System.out.println();
            System.out.println(":: MAGAZINES ::");
            System.out.println();
        } while (exit != 0);
    }

    public static void makeReport() {
        int exit = 1;
        do {
            System.out.println();
            System.out.println(":: REPORTS ::");
            System.out.println();
        } while (exit != 0);
    }

    public static void makeReport(Date date) {
        int exit = 1;
        do {
            System.out.println();
            System.out.println(":: REPORT TODAY ::");
            System.out.println();
        } while (exit != 0);
    }
}
