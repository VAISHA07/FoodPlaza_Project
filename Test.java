package com.foodplazza.Test;

import java.sql.Connection;

import com.foodplazza.Utility.DButility;

public class Test {

	public static void main(String[] args) {
		Connection con=DButility.getConnect();
		if(con!=null)
		{
			System.out.println("Connection Succesfull!!");
		}
		else
		{
			System.out.println("Connection Fail:!");
		}

	}

}
