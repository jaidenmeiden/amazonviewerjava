package com.jaidenmeiden.amazonviewer;

import com.jaidenmeiden.amazonviewer.model.Movie;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie("Coco", "Animation", "", 120, (short)2019);
        System.out.println(movie.toString());
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

            int response = 0;
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
        do {
            System.out.println();
            System.out.println(":: MOVIES ::");
            System.out.println();
        } while (exit != 0);
    }

    public static void showSeries() {
        int exit = 1;
        do {
            System.out.println();
            System.out.println(":: SERIES ::");
            System.out.println();
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
        do {
            System.out.println();
            System.out.println(":: BOOKS ::");
            System.out.println();
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
