package com.foodplazza.Test;

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodplazza.Dao.FoodImpl;
import com.foodplazza.pojo.Food;

public class FoodTest {

	public static void main(String[] args) throws IOException {
		String FoodName;
		int FoodQuantity;
		String FoodType;
		int FoodPrice;
		boolean b;
		int choice;
		Scanner sc=new Scanner(System.in);
		FoodImpl fi=new FoodImpl();
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		while(true) {
		System.out.println("\n1.ADD FOOD\n2.UPDATE FOOD\n3.DELETE FOOD\n4.SEARCH FOOD\n5.FOOD CHART\n6.EXIT");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Hungryy!!!! Have some food and make your tummy smile :):)");
			System.out.println("Add your FAV food to chart");
			System.out.print("Enter the Food Name :");
			FoodName=br.readLine();
			System.out.print("Enter the Food type :");
			FoodType=br.readLine();
			System.out.print("Enter the Food Quantity :");
			FoodQuantity=sc.nextInt();
			System.out.print("Enter the Food Price :");
			FoodPrice=sc.nextInt();
			
			Food food=new Food(FoodName,FoodType,FoodQuantity,FoodPrice);
			b=fi.addFood(food);
			if(b)
			{
				System.out.println("\nAdded to your Chart\nLooks Empty Add some more food");
			}
			else
			{
				System.out.println("\nTry again to add your food in chart");
			}
			break;
		case 2:
			System.out.println("Hungryy!!!! Have some food and make your tummy smile :):)\n Wantto make some changes in your Chart");
			System.out.println("Update your FAV food to chart");
			System.out.println("Enter your FoodId : ");
			int foodid=sc.nextInt();
			System.out.print("Enter the Food Name :");
			FoodName=br.readLine();
			System.out.print("Enter the Food type :");
			FoodType=br.readLine();
			System.out.print("Enter the Food Category :");
			FoodQuantity=sc.nextInt();
			System.out.print("Enter the Food Price :");
			FoodPrice=sc.nextInt();
			
			Food food1=new Food(FoodName,FoodType,FoodQuantity,FoodPrice);
			
			food1.setFoodid(foodid);
			b=fi.updateFoodById(food1);
			if(b)
			{
				System.out.println("Updated your chart\nReady to Eat");
			}
			else
			{
				System.out.println("\nTry again to update your chart");
			}
			break;
		case 3:
			System.out.println("OOPS :{:{Want to Delete some dish");
			System.out.print("Enter the id :");
			int foodid1=sc.nextInt();
             Food food2=new Food();
			
			food2.setFoodid(foodid1);
			System.out.println(foodid1);
			b=fi.deleteFoodById(foodid1);
			if(b)
			{
				System.out.println("Dish deleted from the chart");
			}
			else
			{
				System.out.println("\nTry again couldn't delete from your chart");
			}
			break;
			
		case 4:
			System.out.println("Want to Search for Food Name");
			System.out.print("Enter the Foodid :");
			int z=sc.nextInt();
            Food sfood=fi.searchFoodById(z);
            if(sfood!=null&&sfood.getFoodid()==z)
			{
				System.out.println(sfood);
			}
			else
			{
				System.out.println("Invalid Id");
			}
			break;
			
		case 5:
			List<Food> foodlist=fi.getAllFood();
			Iterator<Food>it=foodlist.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			break;
		case 6:
		       System.exit(0);
		       break;
		default:
				System.out.println("Invalid Choice");
		}

	}
	}

}
