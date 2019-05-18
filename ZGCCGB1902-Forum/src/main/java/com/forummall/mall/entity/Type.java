package com.forummall.mall.entity;

import java.io.Serializable;

/**商品类型表*/
public class Type implements Serializable{

	private static final long serialVersionUID = -259942431057555369L;
	private Integer id;
	private String name;
	
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
}
