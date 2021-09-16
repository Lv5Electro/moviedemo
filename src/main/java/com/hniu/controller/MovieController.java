package com.hniu.controller;

import com.alibaba.fastjson.JSONObject;
import com.hniu.domain.Movie;
import com.hniu.service.MovieService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-06-24 20:58
 */
@RestController
@RequestMapping("/movie")
@CrossOrigin
public class MovieController {

	private final MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping(value = "/findAllMovie", produces = "application/json; charset=utf-8")
	public String findAllMovie() {
		List<Movie> movies = movieService.findAllMovie();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("movies", movies);
		String rs = jsonObject.toJSONString();
		return rs;
	}

	@GetMapping(value = "/findMovieByIsScreen", produces = "application/json; charset=utf-8")
	public String findMovieByIsScreen(Integer isScreen, Boolean isLimit) {
		List<Movie> movies = movieService.findMovieByIsScreen(isScreen, isLimit);
		JSONObject jsonObject = new JSONObject();
		if (isLimit) {
			List<Movie> newMovies = new ArrayList<>();
			int i = 0;
			for (Movie movie : movies) {
				if (i >= 5) {
					break;
				}
				newMovies.add(movie);
				i++;
			}
			jsonObject.put("movies", newMovies);
		} else {
			jsonObject.put("movies", movies);
		}
		String rs = jsonObject.toJSONString();
		return rs;
	}

	@GetMapping(value = "/findIsScreenMovieCount", produces = "application/json; charset=utf-8")
	public Integer findIsScreenMovieCount(Integer isScreen) {
		Integer count = movieService.findIsScreenMovieCount(isScreen);
		return count;
	}
}
