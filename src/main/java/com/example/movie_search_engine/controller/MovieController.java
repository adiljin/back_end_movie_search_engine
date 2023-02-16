package com.example.movie_search_engine.controller;

import com.example.movie_search_engine.model.Movie;
import com.example.movie_search_engine.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/movies")
@CrossOrigin("http://localhost:3000/")
public class MovieController {
    private String apikey = "339381a4";

    @Autowired
    private MovieRepo movieRepo;
    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/get")
    public List<Movie> searchMovieStatic() {
        return movieRepo.findAll();
    }

    @GetMapping("/{title}")
    public List<Movie> searchMovie(@PathVariable String title) {
        String url = UriComponentsBuilder.fromUriString("http://www.omdbapi.com/?apikey="+apikey)
                .queryParam("&")
                .queryParam("t", title)
                .toUriString();

        List<Movie> list = new ArrayList<>();
        Movie movie = restTemplate.getForObject(url, Movie.class);
        list.add(movie);
        System.out.println(url);
        System.out.println(movie.getTitle());
        return list;
    }

    @PostMapping()
    Movie newMovie(@RequestBody List<Movie> newMovie){
        Movie movie = newMovie.get(0);
        return movieRepo.save(movie);
    }

}




