package com.forummall.forum.vo;

import java.io.Serializable;

/**用户论坛浏览历史表*/
public class UserHistory implements Serializable{

	private static final long serialVersionUID = 7476489829434303493L;
	private Integer id;
	private Integer titleId;
	private Integer forumId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTitleId() {
		return titleId;
	}
	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}
	public Integer getForumId() {
		return forumId;
	}
	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}
}
