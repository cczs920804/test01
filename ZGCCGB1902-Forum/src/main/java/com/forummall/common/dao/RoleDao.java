package com.forummall.common.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.forummall.common.entity.Role;
import com.forummall.common.vo.CheckBox;
import com.forummall.common.vo.RoleMenus;

public interface RoleDao {
	/**
	 * 查询总记录数
	 * @param name
	 * @return
	 */
	int getRowCount(@Param("name")String name);
	/**
	 * 查询当前页要呈现的记录
	 * @param name
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	List<Role> findPageObjects(
			@Param("name")String name,
			@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize);

	/**
	 * 将角色自身信息写入到数据库
	 * @param entity
	 * @return
	 */
	int insertObject(Role entity);

	/**为角色添加功能*/
	List<CheckBox> findObjects();

	/**
	 * 基于角色id查找角色相关信息
	 * @param id
	 * @return
	 */
	RoleMenus findObjectById(Integer id);

	/**
	 * 将角色自身信息更新到数据库
	 * @param entity
	 * @return
	 */
	int updateObject(Role entity);
}
