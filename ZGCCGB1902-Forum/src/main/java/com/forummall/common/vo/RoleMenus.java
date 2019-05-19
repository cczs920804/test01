package com.forummall.common.vo;

import java.io.Serializable;
import java.util.List;
/**角色与功能关系表*/
public class RoleMenus implements Serializable{

	private static final long serialVersionUID = -1443157094129452468L;
	private Integer id;
	private String role;
	private List<Integer> menuIds;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Integer> getMenuIds() {
		return menuIds;
	}
	public void setMenuIds(List<Integer> menuIds) {
		this.menuIds = menuIds;
	}
}
