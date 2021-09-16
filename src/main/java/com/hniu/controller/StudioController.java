package com.hniu.controller;

import com.alibaba.fastjson.JSONObject;
import com.hniu.domain.Studio;
import com.hniu.service.StudioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-06-24 20:58
 */
@RestController
@RequestMapping("/studio")
@CrossOrigin
public class StudioController {

	private final StudioService studioService;

	public StudioController(StudioService studioService) {
		this.studioService = studioService;
	}

	@GetMapping(value = "/findAllStudio", produces = "application/json; charset=utf-8")
	public String findAllStudio() {
		List<Studio> studios = studioService.findAllStudio();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("studios", studios);
		String rs = jsonObject.toJSONString();
		return rs;
	}

}
