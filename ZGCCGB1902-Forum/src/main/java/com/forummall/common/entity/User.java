package com.forummall.common.entity;

import java.io.Serializable;

/**用户个人信息*/
public class User implements Serializable{

	private static final long serialVersionUID = 7203513067217610612L;
	
	private Integer id;
	//用户实际姓名
	private String name;
	private Integer age;
	private String gender;
	private Long idCard;
	private Integer tel;
	private String email;
	//用户名（登录账号）
	private String username;
	private String password;
	private String salt;
	//用户状态 正常=1 禁言=2 冻结=0
	private Integer valid=1;
	//昵称
	private String forumName;
	//用户论坛等级
	private int level=1;
	
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getForumName() {
		return forumName;
	}
	public void setForumName(String forumName) {
		this.forumName = forumName;
	}
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
