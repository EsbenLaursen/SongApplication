package com.example.esbenlaursen.songapplication;

/**
 * Created by EsbenLaursen on 23-02-2017.
 */

public class Song {
    private String title;
    private String artist;
    private int bpm;
    private int year;
    private boolean isFavorite;

    public Song(String title, String artist, int bpm, int year, boolean isFavorite) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
        this.year = year;
        this.isFavorite = isFavorite;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public int getYear() {
        return year;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}


