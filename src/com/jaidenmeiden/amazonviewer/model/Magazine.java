package com.jaidenmeiden.amazonviewer.model;

import java.util.Date;

//Magazine, no podran ser leidas, salamente se mostraran
public class Magazine {

    private int id;

    private String title;

    private Date editionDate;

    private String editorial;

    private String[] creators;

    public Magazine() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String[] getCreators() {
        return creators;
    }

    public void setCreators(String[] creators) {
        this.creators = creators;
    }
}
