package com.foodplazza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.foodplazza.Utility.DButility;
import com.foodplazza.pojo.Cart;

public class CartImpl implements CartDao{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;
	
	@Override
	public boolean addToCart(Cart cart) {
		try {
			con=DButility.getConnect();
			sql="insert into Cart_FP(FoodId,FoodName,EmailId,Price,TotalPrice,Quantity)values(?,?,?,?,?,?)";
		    ps=con.prepareStatement(sql);
		    ps.setInt(1,cart.getFoodId());
		    ps.setString(2,cart.getFoodName());
		    ps.setString(3,cart.getEmailId());
		    ps.setInt(4,cart.getPrice());
		    ps.setInt(5,cart.getTotalPrice());
		    ps.setInt(6,cart.getQuantity());
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
	public boolean deleteCart(int cartid) {
		try {
			con=DButility.getConnect();
			sql="delete from Cart_FP where CartId=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1,cartid);
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
	public boolean ClearCartbyEamilId(String EmailId) {
		try {
			con=DButility.getConnect();
			sql="delete from Cart_FP where EmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,EmailId);
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
	public List<Cart> showCart(String EmailId) {
		List<Cart>cartlist = new ArrayList<Cart>();
		try {
			con=DButility.getConnect();
			sql="select * from Cart_FP where EmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,EmailId);
			rs=ps.executeQuery();
			while(rs.next())
			{
		    Cart cart1=new Cart();
		    cart1.setCartId(rs.getInt("CartId"));
		    cart1.setFoodId(rs.getInt("FoodId"));
		    cart1.setFoodName(rs.getString("FoodName"));
		    cart1.setEmailId(rs.getString("EmailId"));
		    cart1.setPrice(rs.getInt("Price"));
		    cart1.setTotalPrice(rs.getInt("TotalPrice"));
		    cart1.setQuantity(rs.getInt("Quantity"));
		    
		    cartlist.add(cart1);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return cartlist;
	}

	@Override
	public boolean searchCart(String foodName) {
		try {
			con=DButility.getConnect();
			sql="select * from Cart_FP where FoodName=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,foodName);
			rs=ps.executeQuery();
			while(rs.next())
			{
				return true;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateQun(Cart cart) {
		try {
			con=DButility.getConnect();
			sql="update Cart_FP SET FoodId=?,EmailId=?,Price=?,TotalPrice=?,Quantity=? WHERE FoodName=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1,cart.getFoodId());
		    ps.setString(2,cart.getFoodName());
		    ps.setString(3,cart.getEmailId());
		    ps.setInt(4,cart.getPrice());
		    ps.setInt(5,cart.getTotalPrice());
		    ps.setInt(6,cart.getQuantity());
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

}
