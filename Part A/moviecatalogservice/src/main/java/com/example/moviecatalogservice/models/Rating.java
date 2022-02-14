package com.example.moviecatalogservice.models;

public class Rating {

    private String rid;

    private String movieId;

    private String rating;

    public Rating() {

    }

    public Rating(String rid, String movieId, String rating) {
        this.movieId = movieId;
        this.rid = rid;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
