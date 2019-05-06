package com.jaidenmeiden.amazonviewer;

import com.jaidenmeiden.amazonviewer.model.*;
import com.jaidenmeiden.makereport.Report;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * <h1>AmazonViewer</h1>
 * AmazonViewer es un programa que permite visualizar Movies, Series con sus respectivos Chapters,
 * Books y Magazines. Te permite generar reportes generales y con fecha del día.
 * <p>
 * Existen algunas reglas como que todos los elementos pueden ser visualizadors o leídos a excepción
 * de las Magazines, estás solo pueden ser vistas a modo de exposición sin ser leídas.
 * 
 * @author Highlander Sword
 * @version 1.1
 * @since 2018
 * 
 * */
public class Main {
	
	private static ArrayList<Movie> movies;
	private static ArrayList<Serie> series;
	private static ArrayList<Book> books;

    public static void main(String[] args) {
    	//Ejemplo de instanciar una clase abstracta, ya que no se peude instanciar por si misma
    	/*
    	Film film = new Movie("Movie ", "Genre example", "Creator example", 120, (short)(2019));
    	film.view();
    	*/
    	
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
        movies = Movie.makeMoviesList();
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
	            movieSelected.view();
            } else {
            	exit = 0;
            }
            
        } while (exit != 0);
    }

    public static void showSeries() {
        int exit = 1;
        series = Serie.makeSeriesList();
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
            	showChapters(series.get(response - 1).getChapters());
            } else {
            	exit = 0;
            }
        } while (exit != 0);
    }

    public static void showChapters(ArrayList<Chapter> chapters) {
        int exit = 1;
        do {
            System.out.println();
            System.out.println(":: CHAPTERS ::");
            System.out.println();
            
            for(int i = 0; i < chapters.size(); i++) {
                System.out.println((i+1) + ". Chapter: " + chapters.get(i).getTitle() + " Visto: " + chapters.get(i).isViewed());
            }
            
            System.out.println();
            System.out.println("Selecciona un capitulo digitando el codigo o");
            System.out.println("digita 0 para regreesar al menú de series!");
            System.out.println();
            
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());
            
            if(response > 0) {
            	Chapter chapterSelected = chapters.get(response - 1);
            	chapterSelected.view();
            } else {
            	exit = 0;
            }
        } while (exit != 0);
    }

    public static void showBooks() {
        int exit = 1;
        books = Book.makeBooksList();
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
            	bookSelected.read();
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
    	
    	Report report = new Report();
		report.setNameFile("reporte");
		report.setExtension("txt");
		report.setTitle(":: VISTOS :: \n\n");
		report.setContent(print(report));
		report.makeReport();
    }

    public static void makeReport(Date date) {
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = df.format(date);
		Report report = new Report();
		
		report.setNameFile("reporte" + dateString);
		report.setExtension("txt");
		report.setTitle(":: VISTOS :: \n\n");
		report.setContent(print(report));
		report.makeReport();
    }
    
    public static String print(Report report){
    	String contentReport = report.getTitle();
		
		if(movies != null) {
			for (Movie movie : movies) {
				if (movie.getIsViewed()) {
					contentReport += ":: MOVIE :: \n";
					contentReport += movie.toString() + "\n";
					
				}
			}
			contentReport += "\n";
			contentReport += "\n";
		}
		
		if(series != null) {
			for (Serie serie : series) {
				if (serie.getIsViewed()) {
					contentReport += ":: SERIE :: \n";
					contentReport += serie.toString() + "\n";
					contentReport += "\n";
					for (Chapter chapter : serie.getChapters()) {
						if (chapter.getIsViewed()) {
							contentReport += ":: CHAPTER :: \n";
							contentReport += chapter.toString() + "\n";
						}
					}
					contentReport += "\n";
				}
			}
			contentReport += "\n";
		}
		
		if(books != null) {
			for (Book book : books) {
				if (book.getIsReaded()) {
					contentReport += ":: BOOK :: \n";
					contentReport += book.toString() + "\n";
					
				}
			}
		}
    	return contentReport;
    }
}
