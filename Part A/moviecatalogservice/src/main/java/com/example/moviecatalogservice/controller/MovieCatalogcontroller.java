package com.example.moviecatalogservice.controller;

import com.example.moviecatalogservice.models.Catalog;
import com.example.moviecatalogservice.models.Movie;
import com.example.moviecatalogservice.models.Rating;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogcontroller {

    @RequestMapping("/{movieId}")
    public Catalog getCatalog(@PathVariable String movieId) {
        RestTemplate restTemplate = new RestTemplate();
        Movie movie = restTemplate.getForObject("http://localhost:8082/movies/get/" + movieId, Movie.class);
        Rating rating = restTemplate.getForObject("http://localhost:8081/rating/getrating/" + movieId, Rating.class);
        return new Catalog(movie.getName(), movie.getDescription(), rating.getRating(), movie.getMovieId());

    }

}
