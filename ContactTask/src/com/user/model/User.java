package com.user.model;

public class User {
	private int nunmber;
	private String name;
	public int getNunmber() {
		return nunmber;
	}
	@Override
	public String toString() {
		return "User [nunmber=" + nunmber + ", name=" + name + "]";
	}
	public User(int nunmber, String name) {
		super();
		this.nunmber = nunmber;
		this.name = name;
	}
	public void setNunmber(int nunmber) {
		this.nunmber = nunmber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
