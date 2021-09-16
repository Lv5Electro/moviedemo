package com.hniu.service;

import com.hniu.domain.User;


/**
 * @Author Lv5电击
 * @Date 2020-07-02 9:32
 */
public interface UserService {

	Integer saveUser(User user);

	User findUserByNameAndPwd(String uName, String uPassword);

	User findUserByNameNickName(String uName, String uNickName);

	void updateUser(User user);
}
