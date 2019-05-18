package com.forummall.forum.entity;

import java.io.Serializable;

/** 版块信息表*/
public class Block implements Serializable{

	private static final long serialVersionUID = -4486631242349725668L;
	private Integer id;
	private String name;
	private Integer parentId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}
