package com.example.movieratingservice.controller;

import com.example.movieratingservice.models.Rating;
import com.example.movieratingservice.service.MovieRatingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rating")
@RestController
public class MovieRatingController {
    private final MovieRatingService movieRatingService;

    public MovieRatingController(MovieRatingService movieRatingService) {
        this.movieRatingService = movieRatingService;
    }

    @GetMapping("/getAllRatings")
    public List<Rating> getAllRatings() {
        return movieRatingService.getAllRatings();
    }

    @GetMapping("/get/{ratingID}")
    public Rating getRating(@PathVariable String ratingID) {
        return movieRatingService.getRating(ratingID);
    }

    @GetMapping("/getrating/{movieId}")
    public Rating getMovieRating(@PathVariable String movieId) {
        return movieRatingService.getByMovieId(movieId);
    }

    @PostMapping("/createRating")
    public Rating createRating(@RequestBody Rating rating) {
        return movieRatingService.create(rating);
    }

    @DeleteMapping("/deleteRating/{ratingId}")
    public String deleteRating(@PathVariable String ratingId) {
        movieRatingService.delete(ratingId);
        return "Rating Deleted";
    }

    @PutMapping("/updateRating/{ratingId}")
    public Rating updateRating(@RequestBody Rating rating, @PathVariable String ratingId) {
        return movieRatingService.update(rating, ratingId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteRatings() {
        movieRatingService.deleteAll();
        return "All Ratings data deleted";
    }
}
