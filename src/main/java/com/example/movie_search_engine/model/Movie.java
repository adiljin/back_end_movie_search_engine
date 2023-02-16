package com.example.movie_search_engine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="MOVIE")
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Year")
    private String year;

    @JsonProperty("Rated")
    private String rated;

    @JsonProperty("Released")
    private String released;

    @JsonProperty("Runtime")
    private String runtime;

    @JsonProperty("Genre")
    private String genre;

    @JsonProperty("Director")
    private String director;

    @JsonProperty("Writer")
    private String writer;

    @JsonProperty("Actors")
    private String actors;

    @JsonProperty("Plot")
    private String plot;

    @JsonProperty("Language")
    private String language;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("Awards")
    private String awards;

    @JsonProperty("Poster")
    private String poster;

    @JsonProperty("imdbRating")
    private String imdbRating;

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    // getters and setters
}
