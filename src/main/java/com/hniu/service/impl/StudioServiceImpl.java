package com.hniu.service.impl;

import com.hniu.dao.StudioDao;
import com.hniu.domain.Studio;
import com.hniu.service.StudioService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-07-02 9:33
 */
@Service("StudioService")
public class StudioServiceImpl implements StudioService {

	private final StudioDao studioDao;

	public StudioServiceImpl(StudioDao studioDao) {
		this.studioDao = studioDao;
	}

	@Override
	public List<Studio> findAllStudio() {
		return studioDao.findAllStudio();
	}
}
