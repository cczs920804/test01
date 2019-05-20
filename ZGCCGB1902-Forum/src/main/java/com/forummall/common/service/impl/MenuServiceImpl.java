package com.forummall.common.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.forummall.common.dao.MenusDao;
import com.forummall.common.dao.RoleMenusDao;
import com.forummall.common.entity.Menus;
import com.forummall.common.exception.ServiceException;
import com.forummall.common.service.MenuService;
import com.forummall.common.vo.Node;

public class MenuServiceImpl implements MenuService{
	
	@Autowired
	private MenusDao menusDao;
	@Autowired
	private RoleMenusDao roleMenusDao;
	
	@Override
	public int updateObject(Menus entity) {
		//1.进行参数校验
				if(entity==null)
					throw new IllegalArgumentException("保存对象不能为空");
				if(StringUtils.isEmpty(entity.getName()))
					throw new IllegalArgumentException("菜单名不能为空");
				if(StringUtils.isEmpty(entity.getPermission()))
					throw new IllegalArgumentException("权限标识不能为空");
				//....
				//2.将对象写入到数据库
				int rows=0;
				try {
					rows=menusDao.updateObject(entity);
				}catch(Throwable e) {
					e.printStackTrace();
					throw new ServiceException("update error");
				}
				return rows;
	}

	@Override
	public int saveObject(Menus entity) {
		//1.进行参数校验
				if(entity==null)
				throw new IllegalArgumentException("保存对象不能为空");
				if(StringUtils.isEmpty(entity.getName()))
				throw new IllegalArgumentException("菜单名不能为空");
				if(StringUtils.isEmpty(entity.getPermission()))
				throw new IllegalArgumentException("权限标识不能为空");
				//....
				//2.将对象写入到数据库
				int rows=0;
				try {
				rows=menusDao.insertObject(entity);
				}catch(Throwable e) {
				e.printStackTrace();
				throw new ServiceException("save error");
				}
				return rows;
	}

	@Override
	public List<Node> findZtreeMenuNodes() {
		return menusDao.findZtreeMenuNodes();
	}

	@Override
	public List<Map<String, Object>> findObjects() {
		List<Map<String,Object>> list=menusDao.findObjects();
		if(list==null||list.size()==0)
	    throw new ServiceException("没有对应数据");
		return list;
	}

	@Override
	public int deleteObject(Integer id) {
		//1.验证参数有效性
				if(id==null||id<1)
				throw new IllegalArgumentException("id值不正确");
				//2.判定菜单是否有子菜单
				int childCount=menusDao.getChildCount(id);
				if(childCount>0)
				throw new ServiceException("请先删除子菜单");
				//3.删除菜单自身信息
				int rows=menusDao.deleteObject(id);
				if(rows==0)
				throw new ServiceException("菜单可能已经不存在");
				//4.删除菜单关系数据
				roleMenusDao.deleteObjectsByMenuId(id);
				return rows;
	}

}
