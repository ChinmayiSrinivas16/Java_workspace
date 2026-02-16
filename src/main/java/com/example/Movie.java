package com.example;

public class Movie {

    private int id;
    private String title;

    // Default Constructor
    public Movie() {
    }

    // Parameterized Constructor
    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }
}
