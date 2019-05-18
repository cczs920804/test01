package com.forummall.forum.entity;

import java.io.Serializable;
/**
 * 主题回帖表（Reply）（版块名加主题ID组成）					
 * @author Administrator
 *
 */
import java.util.Date;

/**主题回复表*/
public class Reply implements Serializable {
	
	private static final long serialVersionUID = 1894791486055789231L;
	private Integer id;
	private Integer forumId; 
	private int state;
	private String text;
	private Date createdTime;
	private Integer parentId;
	
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
	public Integer getForumId() {
		return forumId;
	}
	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getCreateTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}
