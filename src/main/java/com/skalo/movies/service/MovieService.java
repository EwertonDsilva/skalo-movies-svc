package com.skalo.movies.service;

import skalo.model.MovieRequest;
import skalo.model.MovieResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
	
	
	

	    private List<MovieResponse> movies = new ArrayList<>();

	    public MovieResponse addMovie(com.skalo.movies.model.MovieRequest request) {
	        MovieResponse movieResponse = new MovieResponse();
	        movieResponse.setTitle(request.getTitle());
	        movieResponse.setYear(request.getYear());
	        movieResponse.setDirector(request.getDirector());
	        movies.add(movieResponse);
	        return movieResponse;
	    }

	    public List<MovieResponse> getAllMovies() {
	        return movies;
	        
	        
	    }
	}

    
    

