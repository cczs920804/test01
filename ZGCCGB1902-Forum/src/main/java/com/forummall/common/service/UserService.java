package com.forummall.common.service;

import com.forummall.common.entity.User;

public interface UserService {
	
	int insertObject(User user,Integer[] roleIds);
}
