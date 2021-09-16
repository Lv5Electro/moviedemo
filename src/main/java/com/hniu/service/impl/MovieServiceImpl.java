package com.hniu.service.impl;

import com.hniu.dao.MovieDao;
import com.hniu.domain.Movie;
import com.hniu.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-06-24 20:59
 */
@Service("MovieService")
public class MovieServiceImpl implements MovieService {

	private final MovieDao movieDao;

	public MovieServiceImpl(MovieDao movieDao) {
		this.movieDao = movieDao;
	}


	@Override
	public List<Movie> findAllMovie() {
		return movieDao.findAllMovie();
	}

	@Override
	public List<Movie> findMovieByIsScreen(Integer isScreen, Boolean isLimit) {
		return movieDao.findMovieByIsScreen(isScreen, isLimit);
	}

	@Override
	public Integer findIsScreenMovieCount(Integer isScreen) {
		return movieDao.findIsScreenMovieCount(isScreen);
	}
}
