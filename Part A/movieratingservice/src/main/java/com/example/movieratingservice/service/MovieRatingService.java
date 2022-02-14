package com.example.movieratingservice.service;

import com.example.movieratingservice.models.Rating;
import com.example.movieratingservice.repository.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRatingService {

    private final RatingRepository ratingRepository;

    public MovieRatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    public Rating getRating(String ratingID) {
        return ratingRepository.findById(ratingID).orElse(null);
    }

    public Rating create(Rating rating) {
        return ratingRepository.save(rating);
    }

    public void delete(String ratingId) {
        ratingRepository.deleteById(ratingId);
    }

    public Rating update(Rating rating, String ratingId) {
        Rating rating1 = ratingRepository.findById(ratingId).get();
        rating1.setMovieId(rating.getMovieId());
        rating1.setRating(rating.getRating());
        ratingRepository.save(rating1);
        return rating1;
    }

    public Rating getByMovieId(String movieId) {
        return ratingRepository.findByMovieId(movieId);
    }

    public void deleteAll() {
        ratingRepository.deleteAll();
    }
}
