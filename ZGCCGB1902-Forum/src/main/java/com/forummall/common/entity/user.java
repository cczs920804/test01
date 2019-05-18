package com.forummall.common.entity;

import java.io.Serializable;

/**用户个人信息*/
public class user implements Serializable{

	private static final long serialVersionUID = 7203513067217610612L;
	
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private Long idCard;
	private Integer tel;
	private String email;
	private String userName;
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getIdCard() {
		return idCard;
	}
	public void setIdCard(Long idCard) {
		this.idCard = idCard;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
