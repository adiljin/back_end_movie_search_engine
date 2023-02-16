package com.example.movie_search_engine.repository;


import com.example.movie_search_engine.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie,Long> {
}
