package com.hniu.dao;

import com.hniu.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author Lv5电击
 * @Date 2020-07-02 9:31
 */
@Repository
public interface UserDao {

	Integer saveUser(User user);

	User findUserByNameAndPwd(@Param("uName") String uName, @Param("uPassword") String uPassword);

	User findUserByNameNickName(@Param("uName") String uName, @Param("uNickName") String uNickName);

	void updateUser(User user);
}
