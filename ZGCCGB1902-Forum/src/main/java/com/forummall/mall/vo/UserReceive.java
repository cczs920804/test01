package com.forummall.mall.vo;

import java.io.Serializable;

/**用户与收货信息*/
public class UserReceive implements Serializable {

	private static final long serialVersionUID = 7125636077972123169L;
	private Integer id;
	private Integer receiptId;
	private Integer forumId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getReceiptId() {
		return receiptId;
	}
	public void setReceiptId(Integer receiptId) {
		this.receiptId = receiptId;
	}
	public Integer getForumId() {
		return forumId;
	}
	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}
}
