package com.forummall.common.service;

import java.util.List;
import java.util.Map;

import com.forummall.common.entity.Menus;
import com.forummall.common.vo.Node;

public interface MenuService {
	/**
	 * 保存菜单信息到数据库
	 * @param entity
	 * @return
	 */
	int updateObject(Menus entity);
	/**
	 * 保存菜单信息到数据库
	 * @param entity
	 * @return
	 */
	int saveObject(Menus entity);
	
	List<Node> findZtreeMenuNodes();
	List<Map<String,Object>> findObjects();
	/**
	 * 基于菜单id删除菜单元素
	 * @param id
	 * @return
	 */
	int deleteObject(Integer id);
}
