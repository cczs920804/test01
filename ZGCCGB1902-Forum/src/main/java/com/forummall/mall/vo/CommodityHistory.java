package com.forummall.mall.vo;

import java.io.Serializable;

/**商品浏览历史表*/
public class CommodityHistory implements Serializable{

	private static final long serialVersionUID = 8200256649131495016L;
	
	private Integer id;
	private Integer commodityId;
	private Integer userId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
}
