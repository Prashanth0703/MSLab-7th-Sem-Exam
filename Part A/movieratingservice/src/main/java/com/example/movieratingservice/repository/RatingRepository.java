package com.example.movieratingservice.repository;

import com.example.movieratingservice.models.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {
    public Rating findByMovieId(String movieId);
}
