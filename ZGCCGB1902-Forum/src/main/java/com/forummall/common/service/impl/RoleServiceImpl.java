package com.forummall.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.forummall.common.dao.RoleDao;
import com.forummall.common.dao.RoleMenusDao;
import com.forummall.common.dao.UserRoleDao;
import com.forummall.common.entity.Role;
import com.forummall.common.exception.ServiceException;
import com.forummall.common.service.RoleService;
import com.forummall.common.utils.PageUtil;
import com.forummall.common.vo.CheckBox;
import com.forummall.common.vo.PageObject;
import com.forummall.common.vo.RoleMenus;

public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private UserRoleDao userRoleDao;
	@Autowired
	RoleMenusDao roleMenusDao;
	
	@Override
	public RoleMenus findObjectById(Integer id) {
		if(id==null||id<1)
			throw new IllegalArgumentException("id值无效");
			RoleMenus rm=roleDao.findObjectById(id);
			if(rm==null)
			throw new ServiceException("没有对应记录");
			return rm;
	}

	@Override
	public int updateObject(Role entity, Integer[] menuIds) {
		//1.参数有效性校验
				if(entity==null)
					throw new IllegalArgumentException("保存对象不能为空");
				if(StringUtils.isEmpty(entity.getName()))
					throw new IllegalArgumentException("角色名不能为空");
				if(menuIds==null||menuIds.length==0)
					throw new IllegalArgumentException("必须为角色分配资源");
				//2.保存角色自身信息
				int rows=roleDao.updateObject(entity);
				//3.保存角色菜单关系数据
				roleMenusDao.deleteObjectsByRoleId(entity.getId());
				roleMenusDao.insertObjects(entity.getId(),
						menuIds);
				//4.返回结果
				return rows;
	}

	@Override
	public int saveObject(Role entity, Integer[] menuIds) {
		//1.参数有效性校验
				if(entity==null)
				throw new IllegalArgumentException("保存对象不能为空");
				if(StringUtils.isEmpty(entity.getName()))
				throw new IllegalArgumentException("角色名不能为空");
				if(menuIds==null||menuIds.length==0)
				throw new IllegalArgumentException("必须为角色分配资源");
				//2.保存角色自身信息
				int rows=roleDao.insertObject(entity);
				//3.保存角色菜单关系数据
				roleMenusDao.insertObjects(entity.getId(),
						menuIds);
				//4.返回结果
				return rows;
	}

	@Override
	public int deleteObject(Integer id) {
		if(id==null||id<1)
			throw new IllegalArgumentException("id值不正确");
			int rows=roleDao.deleteObject(id);
			if(rows==0)
			throw new ServiceException("记录可能已经不存在");
			roleMenusDao.deleteObjectsByRoleId(id);
			//缺少删除用户角色关系数据
		return rows;
	}

	@Override
	public PageObject<Role> findPageObjects(String name, Integer pageCurrent) {
		//1.判定pageCurrent参数合法性
				if(pageCurrent==null||pageCurrent<1) 
					throw new IllegalArgumentException("当前页码值不正确");
				//2.查询日志总记录数,并进行判定
				int rowCount=roleDao.getRowCount(name);
				if(rowCount==0)
					throw new ServiceException("没有找到对应记录");
				//3.查询当前页日志记录
				int pageSize=3;
				int startIndex=(pageCurrent-1)*pageSize;
				List<Role> records=
						roleDao.findPageObjects(name,
								startIndex, pageSize);
				//4.对查询结果进行封装并返回
				PageObject<Role> po = 
				PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
				return po;
	}

	@Override
	public List<CheckBox> findObjects() {
		return roleDao.findObjects();
	}

}
