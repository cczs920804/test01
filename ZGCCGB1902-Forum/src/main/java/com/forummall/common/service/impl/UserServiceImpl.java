package com.forummall.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forummall.common.dao.UserDao;
import com.forummall.common.entity.User;
import com.forummall.common.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	public int insertObject(User user,Integer[] roleIds) {
		int rows = userDao.insertObject(user);
		return rows;
	}

}
