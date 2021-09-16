package com.hniu.service.impl;

import com.hniu.dao.UserDao;
import com.hniu.domain.User;
import com.hniu.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author Lv5电击
 * @Date 2020-07-02 9:33
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

	private final UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Integer saveUser(User user) {
		return userDao.saveUser(user);
	}

	@Override
	public User findUserByNameAndPwd(String uName, String uPassword) {
		return userDao.findUserByNameAndPwd(uName, uPassword);
	}

	@Override
	public User findUserByNameNickName(String uName, String uNickName) {
		return userDao.findUserByNameNickName(uName, uNickName);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

}
