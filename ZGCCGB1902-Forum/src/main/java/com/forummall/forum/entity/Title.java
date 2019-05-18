package com.forummall.forum.entity;

import java.io.Serializable;
import java.util.Date;

/**主题信息表*/
public class Title implements Serializable {

	private static final long serialVersionUID = -8668213911760133885L;
	private Integer id;
	private String title;
	private int state;
	private Date CreateTime;
	private Integer parentId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}
