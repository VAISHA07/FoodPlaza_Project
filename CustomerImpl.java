package com.foodplazza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.foodplazza.pojo.Customer;
import com.foodplazza.pojo.Food;
import com.foodplazza.Utility.DButility;

public class CustomerImpl implements CustomerDao{
	//private static final String CEmailId = null;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;
	@Override
	public boolean addCustomer(Customer customer) {
		try {
			con=DButility.getConnect();
			sql="insert into Customer_FP(CName,CEmailId,Cpassword,CMobNo,CAddr)values(?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1,customer.getCName());
			ps.setString(2,customer.getCEmailid());
			ps.setString(3,customer.getCPassword());
			ps.setInt(4,customer.getCMobNo());
			ps.setString(5,customer.getCAddr());
			row=ps.executeUpdate();
			if(row>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return false;
		}
	
	@Override
	public boolean updateCustomer(Customer customer) {
		try {
			con=DButility.getConnect();
			sql="update Customer_FP set CName=?,CPassword=?,CMobNo=?,CAddr=? where CEmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,customer.getCName());
			ps.setString(2,customer.getCPassword());
			ps.setInt(3,customer.getCMobNo());
			ps.setString(4,customer.getCAddr());
			ps.setString(5,customer.getCEmailid());
			
			row =ps.executeUpdate();
			if(row>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean deleteCustomer(String EmailId) {
		try {
			con=DButility.getConnect();
			sql="delete from Customer_FP where CEmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, EmailId);
		row =ps.executeUpdate();
		if(row>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		}
	
	
	catch(SQLException e)
	{
		e.printStackTrace();
	}
		return false;
	}
	@Override
	public Customer searchbyEmaildID(String EmailId) {
		Customer cl=null;
		try {
	      
			con=DButility.getConnect();
			sql="select * from Customer_FP where CEmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,EmailId);
			rs=ps.executeQuery();
			if(rs.next()) {
				cl=new Customer();
				cl.setCEmailid(rs.getString("CEmailId"));
				cl.setCName(rs.getString("CName"));
				cl.setCPassword(rs.getString("Cpassword"));
				cl.setCMobNo(rs.getInt("CMobNo"));
				cl.setCAddr(rs.getString("CAddr"));

				
			}
			}

			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		return cl;
		
	}
	@Override
	public List<Customer> getAllCustomer() {
		
		List<Customer> cl=new ArrayList<Customer>();;
		try {
	      
			con=DButility.getConnect();
			sql="select * from Customer_FP";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Customer cl1=new Customer();
				cl1.setCEmailid(rs.getString("CEmailId"));
				cl1.setCName(rs.getString("CName"));
				cl1.setCPassword(rs.getString("Cpassword"));
				cl1.setCMobNo(rs.getInt("CMobNo"));
				cl1.setCAddr(rs.getString("CAddr"));
				cl.add(cl1);

				
			}
			}

			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		return cl;
		
	}


}