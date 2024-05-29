package com.skalo.movies.service.test;

import com.skalo.movies.model.MovieRequest;
import com.skalo.movies.service.MovieService;

import skalo.model.MovieResponse;

public class MovieServiceTest {

	public static void main(String[] args) {
		
		MovieService movieService = new MovieService();

        MovieRequest request = new MovieRequest();
        request.setTitle("Tropa De Elite");
        request.setYear(2011);
        request.setDirector("José Padilha");

        MovieResponse response = movieService.addMovie(request);

        System.out.println("titulo: " + response.getTitle() + ", Ano: " + response.getYear() + ", Diretor: " + response.getDirector());
    }
	}


