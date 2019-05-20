package com.forummall.common.dao;

import org.apache.ibatis.annotations.Param;

public interface UserRoleDao {
	
	/**
	 * 基于用户id获取用户对应的角色信息
	 * @param id
	 * @return
	 */
	Integer findRoleIdsByUserId(Integer id);
	
	int insertObjects(
			@Param("userId")Integer userId,
			@Param("roleIds")Integer[] roleIds);

	/**
	 * 基于用户id删除角色和用户关系数据
	 * @param id
	 * @return
	 */
	int deleteObjectsByUserId(Integer userId);
	/**
	 * 基于角色id删除角色和用户关系数据
	 * @param id
	 * @return
	 */
	int deleteObjectsByRoleId(Integer roleId);
}
