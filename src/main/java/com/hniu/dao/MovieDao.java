package com.hniu.dao;

import com.hniu.domain.Movie;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-06-24 20:59
 */
@Repository
public interface MovieDao {
	List<Movie> findAllMovie();

	List<Movie> findMovieByIsScreen(@Param("isScreen") Integer isScreen, @Param("isLimit") Boolean isLimit);

	Integer findIsScreenMovieCount(Integer isScreen);
}
