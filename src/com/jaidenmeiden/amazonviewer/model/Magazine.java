package com.jaidenmeiden.amazonviewer.model;

import java.util.Date;
import java.util.ArrayList;

//Magazine, no podran ser leidas, salamente se mostraran
public class Magazine extends Publication {

    private int id;

    public Magazine(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Magazine> makeMagazineList() {
        ArrayList<Magazine> magazines = new ArrayList();
        String[] authors = new String[3];
        for (int i = 0; i < 3; i++) {
            authors[i] = "author "+i;
        }
        for (int i = 1; i <= 5; i++) {
            magazines.add(new Magazine("Magazine " + i, new Date(), "Editorial " + i));
        }

        return magazines;
    }
}
