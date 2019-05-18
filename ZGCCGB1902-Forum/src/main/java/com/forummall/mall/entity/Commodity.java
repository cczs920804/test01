package com.forummall.mall.entity;

import java.io.Serializable;

/**商品信息表*/
public class Commodity implements Serializable {
	
	private static final long serialVersionUID = 8319750674892963628L;
	private Integer id;
	private String name;
	private Integer typeId;
	private String brand;
	private String photo;
	private String param;
	private Integer number;
	private Double price;
	private String text;
	private Integer evaluateId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getEvaluateId() {
		return evaluateId;
	}
	public void setEvaluateId(Integer evaluateId) {
		this.evaluateId = evaluateId;
	}
	public void setPrice(Double price) {
		this.price = price;
	}	
}
