package com.forummall.forum.vo;

import java.io.Serializable;
/**回帖提示表*/
public class Tips implements Serializable {

	private static final long serialVersionUID = 5295258672289751606L;
	private Integer id;
	private Integer titleId;
	private Integer textId;
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
	public Integer getTextId() {
		return textId;
	}
	public void setTextId(Integer textId) {
		this.textId = textId;
	}
	public Integer getForumId() {
		return forumId;
	}
	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}
}
