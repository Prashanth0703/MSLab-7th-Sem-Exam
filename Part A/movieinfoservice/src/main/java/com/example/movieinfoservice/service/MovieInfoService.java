package com.example.movieinfoservice.service;

import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.repository.MovieInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieInfoService {

    private final MovieInfoRepository movieInfoRepository;

    public MovieInfoService(MovieInfoRepository movieInfoRepository) {
        this.movieInfoRepository = movieInfoRepository;
    }

    public List<Movie> getAllMovies() {
        return movieInfoRepository.findAll();
    }

    public Movie getMovie(String movieID) {
        return movieInfoRepository.findById(movieID).orElse(null);
    }

    public Movie create(Movie movie) {
        return movieInfoRepository.save(movie);
    }

    public void delete(String movieId) {
        movieInfoRepository.deleteById(movieId);
    }

    public Movie update(Movie movie, String movieId) {
        Movie movie1 = movieInfoRepository.findById(movieId).get();
        movie1.setName(movie.getName());
        movie1.setDescription(movie.getDescription());
        movieInfoRepository.save(movie1);
        return movie1;
    }

    public void deleteAll() {
        movieInfoRepository.deleteAll();
    }
}
