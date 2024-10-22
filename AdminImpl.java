package com.foodplazza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.foodplazza.Utility.DButility;
import com.foodplazza.pojo.Admin;

public class AdminImpl implements AdminDao{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;
	

	@Override
	public boolean userLogin(String emailId, String password) {
		
		try {
			con=DButility.getConnect();
			sql="select * from Customer_FP where CEmailId=? and Cpassword=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,emailId);
			ps.setString(2,password);
			
			rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
				
			}
			else {
				return false;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean userChangePassword(String emailId, String password) {
		try {
			con=DButility.getConnect();
			sql="update Customer_FP set Cpassword=? where CEmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,password);
			ps.setString(2,emailId);
			
			row=ps.executeUpdate();
			if(row>0)
			{
				return true;
				
			}
			else {
				return false;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean adminLogin(String aemailId, String apassword) {
		try {
			con=DButility.getConnect();
			sql="select * from Admin_FP  where EmailID=? and Password=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,aemailId);
			ps.setString(2,apassword);
			
			rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
				
			}
			else {
				return false;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean adminChangePassword(String aemailId, String apassword) {
		try {
			con=DButility.getConnect();
			sql="update Admin_FP set Password=? where EmailID=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,apassword);
			ps.setString(2,aemailId);
			
			row=ps.executeUpdate();
			if(row>0)
			{
				return true;
				
			}
			else {
				return false;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
