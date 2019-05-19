package com.forummall.common.dao;

import org.apache.ibatis.annotations.Param;

import com.forummall.common.entity.User;

public interface UserDao {
	
	/**
	 * 基于用户id修改用户的密码
	 * @param password 新的密码
	 * @param salt 密码加密时使用的盐值
	 * @param id 用户id
	 * @return
	 */
	int updatePassword(@Param("password")String password,
			@Param("salt")String salt,@Param("id")Integer id);
	
	/**
	 * 基于用户名、手机号、邮箱查找用户信息
	 * @param username
	 * @return
	 */
	User findUser(String username,Integer tel,String email);
	
	/**用户注册*/
	int insertObject(User user);
	
	/**修改用户信息*/
	int updateObject(User user);
	
	
}
