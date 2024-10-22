package com.foodplazza.Utility;
import java.sql.*;
public class DButility {
	public static Connection getConnect()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/basicdb","root","vAt@0711");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
		

}
