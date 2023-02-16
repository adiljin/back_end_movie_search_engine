package com.example.movie_search_engine.repository;


import com.example.movie_search_engine.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepo extends JpaRepository<Movie,Long> {
}
