package com.foodplazza.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodplazza.Dao.CartImpl;
import com.foodplazza.pojo.Cart;
import com.foodplazza.pojo.Customer;

public class CartTest {

	public static void main(String[] args) throws IOException {
		int CartId;
		int FoodId;
		String FoodName;
		String EmailId;
	    int Price;
	    int TotalPrice;
	    int Quantity;
	    int choice;
	    boolean d;
	    Scanner sc = new Scanner(System.in);
	    CartImpl cia=new CartImpl();
	    InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		while(true)
		{
			System.out.println("\n1.ADD TO CHART\n2.DELETE CHART\n3.CLEAR CHART\n4.SHOW CHART\n5.SearchChart\n6.UpdateQuan\n7.Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Add to Cart");
				System.out.print("Enter Food ID : ");
				FoodId=sc.nextInt();
				System.out.print("Enter Food Name : ");
				FoodName=br.readLine();
				System.out.print("Enter EMailID : ");
				EmailId=br.readLine();
				System.out.print("Enter the Price : ");
				Price=sc.nextInt();
				
				System.out.print("Enter the Quantity : ");
				Quantity=sc.nextInt();
				TotalPrice=Quantity*Price;
			    System.out.print("Total Price: "+TotalPrice);
				
				Cart cart=new Cart(FoodId,FoodName,EmailId,Price,TotalPrice,Quantity);
			    d=cia.addToCart(cart);
			    if(d)
			    {
			    	System.out.println("\nAdded to Chart");
			    }
			    else
			    {
			    	System.out.println("Couldn't Add");
			    }
			    break;
			case 2:
			
				System.out.print("Enter CartID :");
				CartId=sc.nextInt();
	            Cart cartdelete = new Cart();
				
	            cartdelete.getCartId();
				
				d=cia.deleteCart(CartId);
				if(d)
				{
					System.out.println("Deleted");
				}
				else
				{
					System.out.println("\nTry again couldn't delete");
				}
				break;
			case 3:
				
				System.out.print("Enter EmailID :");
				EmailId=br.readLine();
	            Cart cartclear = new Cart();
				
	            cartclear.getEmailId();
				
				d=cia.ClearCartbyEamilId(EmailId);
				if(d)
				{
					System.out.println("\nCart is cleared");
				}
				else
				{
					System.out.println("\nTry again couldn't delete");
				}
				break;
				
			case 4:
			    System.out.println("Enter EmailId : ");
			    EmailId=br.readLine();
				List<Cart> cartlist=cia.showCart(EmailId);
				Iterator<Cart>it=cartlist.iterator();
				
			  while(it.hasNext())
				{
					System.out.println(it.next());
				}
				break;
			/*case 5:
				System.out.println("Enter Food Name : ");
				FoodName=br.readLine();
			    List<Cart> list1=cia.searchCart(FoodName);
				Iterator<Cart>it1=list1.iterator();
				
			  while(it1.hasNext())
				{
					System.out.println(it1.next());
				}
				break;
			    */
			case 6:
			       System.exit(0);
			       break;
			default:
					System.out.println("Invalid Choice");
			}
		}
	}

}
