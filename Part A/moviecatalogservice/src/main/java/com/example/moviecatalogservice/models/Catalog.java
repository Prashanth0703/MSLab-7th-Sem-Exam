package com.example.moviecatalogservice.models;

public class Catalog {
    private String name;
    private String desc;
    private String rating;
    private String movieId;

    public Catalog() {

    }

    public Catalog(String name, String desc, String rating, String movieId) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.movieId = movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
