package com.hniu.dao;

import com.hniu.domain.Studio;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-07-02 20:42
 */
@Repository
public interface StudioDao {
	List<Studio> findAllStudio();
}
