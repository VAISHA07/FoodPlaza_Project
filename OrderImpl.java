package com.foodplazza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.foodplazza.Utility.DButility;
import com.foodplazza.pojo.Order;

public class OrderImpl implements OrderDao {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;

	
    @Override
	public Order placeOrder(String EmailId) {
		String date = new Date().toString();
		int totalPrice =0;
		Order order=null;
		try {
			con=DButility.getConnect();
			sql="select sum(TotalPrice)as total from Cart_FP where EmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,EmailId);
			rs=ps.executeQuery();
			if(rs.next())
			{
				totalPrice=rs.getInt("total");
			}
			if(totalPrice>0)
			{
				sql="insert into Order_FP(EmailId,TotalPrice,DATE)values(?,?,?)";
				ps=con.prepareStatement(sql);
				ps.setString(1,EmailId);
				ps.setDouble(2,totalPrice);
				ps.setString(3,date);
				row=ps.executeUpdate();
				if(row>0)
				{
					sql="select * from Order_FP where EmailId=? and DATE=?";
					ps=con.prepareStatement(sql);
					ps.setString(1,EmailId);
					ps.setString(2, date);
					rs=ps.executeQuery();
					
					if(rs.next()) {
						order=new Order();
						order.setOrderId(rs.getInt("OrderId"));
						order.setEmailId(rs.getString("EmailId"));
						order.setTotalPrice(rs.getInt("TotalPrice"));
						order.setDate(rs.getString("DATE"));
						
					}
					
				}
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return order;
	}

	@Override
	public List<Order> displayorder() {
		List<Order> ol= new ArrayList<Order>();
		try {
			con=DButility.getConnect();
			sql="select * from Order_FP";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				 Order order=new Order();
				order.setOrderId(rs.getInt("OrderId"));
				order.setEmailId(rs.getString("EmailId"));
				order.setTotalPrice(rs.getInt("TotalPrice"));
				order.setDate(rs.getString("DATE"));
				ol.add(order);
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return ol;
	}

}
