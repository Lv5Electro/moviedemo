package com.hniu.service;

import com.hniu.domain.Movie;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-06-24 20:59
 */
public interface MovieService {
	List<Movie> findAllMovie();

	List<Movie> findMovieByIsScreen(Integer isScreen, Boolean isLimit);

	Integer findIsScreenMovieCount(Integer isScreen);

}
