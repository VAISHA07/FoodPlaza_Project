package com.foodplazza.pojo;

public class Admin {
	String EmailID;
	String Password;
	public Admin(String emailID, String password) {
		super();
		EmailID = emailID;
		Password = password;
	}
	public Admin() {
		super();
		
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Admin [EmailID=" + EmailID + ", Password=" + Password + "]";
	}
	
	
	
}
