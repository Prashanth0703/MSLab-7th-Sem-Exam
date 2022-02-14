package com.example.movieratingservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table
public class Rating {

    @Id
    private String rid;
    @Column
    private String movieId;
    @Column
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
