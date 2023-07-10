package org.beginningandroid.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/// We are showing the properties of the list to show

public class MovieModel {
    private String title, genre, year;
    public MovieModel() {
    }
    public MovieModel(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String name) {
        this.title = name;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}