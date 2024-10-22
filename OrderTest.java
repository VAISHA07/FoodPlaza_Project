package com.foodplazza.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodplazza.Dao.OrderImpl;
import com.foodplazza.pojo.Order;

public class OrderTest {

	public static void main(String[] args) {
		int OrderId;
		String EmailId;
		int TotalPrice;
		String DATE;
		
		Scanner sc=new Scanner(System.in);
		OrderImpl oi = new OrderImpl();
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		while(true) {
		System.out.println("1.PLACE ORDER\n2.DISPLAY ORDER\n3.EXIT");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		System.out.print("Enter EmailID : ");
		EmailId=sc.next();
		Order order = oi.placeOrder(EmailId);
		System.out.println(order);
		if(order!=null)
		{
			System.out.println("\nOrder is placed\n");
		}
		else
		{
			System.out.println("\nCouldn't Place the order\n");
		}
		break;
		case 2:
		
			List<Order> ol=oi.displayorder();
			Iterator<Order>it=ol.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
			break;
		case 3:
			System.out.println("You Are Free");
		       System.exit(0);
		       break;
		default:
				System.out.println("Invalid Choice");
		}	
		}
	}

}
