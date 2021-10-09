package com.yrrhelp.models;

import java.util.Date;

public class PurchaseReports {

	
	private String id;
	private String name;
	private String category;
	private String user;
	private String date;
	private String price;
	
	
	public PurchaseReports() {
		
	}
	public PurchaseReports(String id, String category, String name,  String user, String date, String price  ) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
        this.price = price;
		this.date = date;
		this.user=user;
	}
	
	public String getName() {
		return name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
