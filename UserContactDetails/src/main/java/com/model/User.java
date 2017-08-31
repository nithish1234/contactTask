package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_contact")
public class User {
	@Id
	private int id;
	private String ContactName;
	private String ContactNumber;

	@Override
	public String toString() {
		return "User [id=" + id + ", ContactName=" + ContactName + ", ContactNumber=" + ContactNumber + "]";
	}

	public User(int id, String contactName, String contactNumber) {
		super();
		this.id = id;
		ContactName = contactName;
		ContactNumber = contactNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
}
