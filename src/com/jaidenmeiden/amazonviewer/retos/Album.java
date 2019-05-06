package com.jaidenmeiden.amazonviewer.retos;

import java.util.ArrayList;

public class Album {

    private static ArrayList<Album.Song> songs;

    public static class Song{
        private String nombre;

        public Song(String nombre){
            this.setNombre(nombre);
        }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }
    }

    public static void main(String[] args){
        songs = new ArrayList();
        for(int i=1;i<=10;i++) {
            addSong(new Album.Song("Canción " + i));
        }
    }

    public static void addSong(Album.Song cancion){
        songs.add(cancion);
    }
}