package com.foodplazza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.foodplazza.Utility.DButility;
import com.foodplazza.pojo.Food;

public class FoodImpl implements FoodDao{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;

	@Override
	public boolean addFood(Food food) {
		try {
		con=DButility.getConnect();
		sql="insert into FoodPlaza(foodname,foodtype,foodquantity,foodprice)values(?,?,?,?)";
		ps=con.prepareStatement(sql);
		ps.setString(1,food.getFoodname());
		ps.setString(2,food.getFoodtype());
		ps.setInt(3,food.getFoodquantity());
		ps.setInt(4,food.getFoodprice());
		
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
	public boolean updateFoodById(Food food) {
		try {
		con=DButility.getConnect();
		sql="update FoodPlaza set foodname=?,foodtype=?,foodquantity=?,foodprice=? where foodid=?";
		ps=con.prepareStatement(sql);
		ps.setString(1,food.getFoodname());
		ps.setString(2,food.getFoodtype());
		ps.setInt(3,food.getFoodquantity());
		ps.setInt(4,food.getFoodprice());
		ps.setInt(5,food.getFoodid());
		
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
	public boolean deleteFoodById(int foodId) {
		try {
			con=DButility.getConnect();
			sql="delete from FoodPlaza where foodid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, foodId);
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
	public Food searchFoodById(int foodid) {
		  Food fl=null;
		try {
	      
			con=DButility.getConnect();
			sql="select * from FoodPlaza where foodid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1,foodid);
			rs=ps.executeQuery();
			if(rs.next()) {
				fl=new Food();
				fl.setFoodid(rs.getInt("foodid"));
				fl.setFoodname(rs.getString("foodname"));
				fl.setFoodtype(rs.getString("foodtype"));
				fl.setFoodquantity(rs.getInt("foodquantity"));
				fl.setFoodprice(rs.getInt("foodprice"));
			}
			}

			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		return fl;
	}

	@Override
	public List<Food> getAllFood() {
		List<Food>foodlist = new ArrayList<Food>();
		try {
			con=DButility.getConnect();
			sql="select * from FoodPlaza";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
			Food foodlist1=new Food();
			foodlist1.setFoodid(rs.getInt("foodid"));
			foodlist1.setFoodname(rs.getString("foodname"));
			foodlist1.setFoodtype(rs.getString("foodtype"));
			foodlist1.setFoodquantity(rs.getInt("foodquantity"));
			foodlist1.setFoodprice(rs.getInt("foodprice"));
			
			foodlist.add(foodlist1);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return foodlist;
	}

}
