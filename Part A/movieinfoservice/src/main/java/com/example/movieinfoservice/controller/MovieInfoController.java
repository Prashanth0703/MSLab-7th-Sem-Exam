package com.example.movieinfoservice.controller;

import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.service.MovieInfoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/movies")
@RestController
public class MovieInfoController {
    private final MovieInfoService movieInfoService;

    public MovieInfoController(MovieInfoService movieInfoService) {
        this.movieInfoService = movieInfoService;
    }
    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies() {
        return movieInfoService.getAllMovies();
    }

    @GetMapping("/get/{movieID}")
    public Movie getMovie(@PathVariable String movieID) {
        return movieInfoService.getMovie(movieID);
    }

    @PostMapping("/createMovie")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieInfoService.create(movie);
    }

    @DeleteMapping("/deleteMovie/{movieId}")
    public String deleteMovie(@PathVariable String movieId) {
        movieInfoService.delete(movieId);
        return "Movie Deleted";
    }

    @PutMapping("/updateMovie/{movieId}")
    public Movie updateMovie(@RequestBody Movie movie, @PathVariable String movieId) {
        return movieInfoService.update(movie, movieId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteMovies() {
        movieInfoService.deleteAll();
        return "All Movies data deleted";
    }
}
