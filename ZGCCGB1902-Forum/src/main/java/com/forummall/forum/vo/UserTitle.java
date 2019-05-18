package com.forummall.forum.vo;

import java.io.Serializable;

/**用户主题表*/
public class UserTitle implements Serializable {

	private static final long serialVersionUID = -4216708263939321687L;
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
