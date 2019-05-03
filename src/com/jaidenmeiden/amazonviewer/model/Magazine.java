package com.jaidenmeiden.amazonviewer.model;

import java.util.Date;

//Magazine, no podran ser leidas, salamente se mostraran
public class Magazine extends Publication {

    private int id;

    public Magazine(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    public int getId() {
        return id;
    }
}
