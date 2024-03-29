package com.forummall.common.entity;

/**角色表*/
public class Role extends BaseEntity {

	private static final long serialVersionUID = -5908076514638301074L;
	private Integer id;
	private String name;
	private String note;
	
	public Integer getId() {
		return id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
}
