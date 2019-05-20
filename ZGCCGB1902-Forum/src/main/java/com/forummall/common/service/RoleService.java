package com.forummall.common.service;

import java.util.List;

import com.forummall.common.entity.Role;
import com.forummall.common.vo.CheckBox;
import com.forummall.common.vo.PageObject;
import com.forummall.common.vo.RoleMenus;

public interface RoleService {
	
	/**
	 * 基于id查询角色以及对应的菜单信息
	 * @param id
	 * @return
	 */
	RoleMenus findObjectById(Integer id);
	
	/**
	 * 更新角色以及角色对应的菜单信息
	 * @param entity
	 * @param menuIds
	 * @return
	 */
	int updateObject(Role entity,
			Integer[] menuIds);
	/**
	 * 保存角色以及角色对应的菜单信息
	 * @param entity
	 * @param menuIds
	 * @return
	 */
	int saveObject(Role entity,
			       Integer[] menuIds);
	
	int deleteObject(Integer id);
	
	PageObject<Role> findPageObjects(
			  String name,
			  Integer pageCurrent);
	
	List<CheckBox> findObjects();
}
