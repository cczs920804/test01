package com.forummall.common.vo;

import java.io.Serializable;

/**用户与角色关系表*/
public class UserRoles implements Serializable {

	private static final long serialVersionUID = 5128439830309040052L;
	private Integer id;
	private Integer rolesId;
	private Integer userId;
	
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
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
