package com.forummall.mall.entity;


import java.io.Serializable;
import java.util.Date;

/**订单表 */
public class Order implements Serializable {

	private static final long serialVersionUID = 8411234415815152936L;
	private Integer id;
	private Integer num;
	private Integer commodityId;
	private int state;
	private Integer userId;
	private Integer receiptId;
	private Integer evaluateId;
	private Date createdTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Integer getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getReceiptId() {
		return receiptId;
	}
	public void setReceiptId(Integer receiptId) {
		this.receiptId = receiptId;
	}
	public Integer getEvaluateId() {
		return evaluateId;
	}
	public void setEvaluateId(Integer evaluateId) {
		this.evaluateId = evaluateId;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
}
