package com.forummall.mall.entity;

import java.io.Serializable;

/**收货信息表*/
public class Receipt implements Serializable {
	
	private static final long serialVersionUID = -4241261046991651942L;
	private Integer id;
	private String name;
	private String addr;
	private long tel;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
}
