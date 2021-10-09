package com.yrrhelp.models;

public class User {
	private String id;
	private String lastlogindate;
	private String name;
	public User(String id, String lastlogindate, String name) {
		super();
		this.id = id;
		this.lastlogindate = lastlogindate;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getlastlogindate() {
		return lastlogindate;
	}
	public void setlastlogindate(String lastlogindate) {
		this.lastlogindate = lastlogindate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
