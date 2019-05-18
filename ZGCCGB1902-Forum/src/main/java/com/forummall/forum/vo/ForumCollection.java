package com.forummall.forum.vo;

import java.io.Serializable;
/**用户论坛收藏表*/
public class ForumCollection implements Serializable {

	private static final long serialVersionUID = 517724695998705599L;
	private Integer id;
	private Integer blockId;
	private Integer titleId;
	private Integer forumId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBlockId() {
		return blockId;
	}
	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
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
