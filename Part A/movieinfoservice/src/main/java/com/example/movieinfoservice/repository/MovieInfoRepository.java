package com.example.movieinfoservice.repository;

import com.example.movieinfoservice.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInfoRepository extends JpaRepository<Movie, String> {
}
