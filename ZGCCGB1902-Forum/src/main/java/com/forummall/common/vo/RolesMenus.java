package com.forummall.common.vo;

import java.io.Serializable;
/**角色与功能关系表*/
public class RolesMenus implements Serializable{

	private static final long serialVersionUID = -1443157094129452468L;
	private Integer id;
	private Integer rolesId;
	private Integer menusId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRolesId() {
		return rolesId;
	}
	public void setRolesId(Integer rolesId) {
		this.rolesId = rolesId;
	}
	public Integer getMenusId() {
		return menusId;
	}
	public void setMenusId(Integer menusId) {
		this.menusId = menusId;
	}
}
