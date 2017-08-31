package com.contact.model;

public class User {
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
