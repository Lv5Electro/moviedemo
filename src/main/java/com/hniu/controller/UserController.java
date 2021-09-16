package com.hniu.controller;

import com.alibaba.fastjson.JSONObject;
import com.hniu.domain.User;
import com.hniu.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Lv5电击
 * @Date 2020-06-24 20:58
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/findUserByNameAndPwd", produces = "application/json; charset=utf-8")
	public String findUserByNameAndPwd(String uName, String uPassword) {
		User user = userService.findUserByNameAndPwd(uName, uPassword);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("user", user);
		String rs = jsonObject.toJSONString();
		return rs;
	}

	@GetMapping(value = "/findUserByNameNickName", produces = "application/json; charset=utf-8")
	public Boolean findUserByNameNickName(String uName, String uNickName) {
		User user = userService.findUserByNameNickName(uName, uNickName);
		System.out.println("发现用户：\t" + user);
		if (user == null) {
			return false;
		}
		return true;
	}

	@PostMapping(value = "/saveUser", produces = "application/json; charset=utf-8")
	public User saveUser(@RequestBody User user) {
		Integer uId = userService.saveUser(user);
		return user;
	}

	@PostMapping(value = "/updateUser", produces = "application/json; charset=utf-8")
	public User updateUser(@RequestBody User user) {
		userService.updateUser(user);
		return user;
	}
}
