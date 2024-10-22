package com.foodplazza.Dao;

public interface AdminDao {
	boolean userLogin(String emailId,String password);
	boolean userChangePassword(String emailId,String password);
	boolean adminLogin(String aemailId,String apassword);
	boolean adminChangePassword(String aemailId,String apassword);
	

}
