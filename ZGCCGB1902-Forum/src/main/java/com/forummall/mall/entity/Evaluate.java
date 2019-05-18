package com.forummall.mall.entity;

import java.io.Serializable;
import java.util.Date;

/** 评价表*/
public class Evaluate implements Serializable {

	private static final long serialVersionUID = -8968213203027017394L;
	private Integer id;
	private Integer userId;
	private String text;
	private Date createdTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
}
