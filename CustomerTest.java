package com.foodplazza.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodplazza.Dao.CustomerImpl;
import com.foodplazza.pojo.Customer;
import com.foodplazza.pojo.Food;

public class CustomerTest {

	public static void main(String[] args) throws IOException {
		String CName;
		 String CEmailid;
		 String CPassword;
		 int CMobNo;
		 String CAddr;
		 boolean c;
		 int choice;
		Scanner sc=new Scanner(System.in);
		CustomerImpl ci = new CustomerImpl();
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		while(true) {
			System.out.println("\n1.ADD CUSTOMER\n2.UPDATE CUSTOMER\n3.DELETE CUSTOMER\n4.SEARCH CUSTOMER\n5.LIST OF CUSTOMER\n6.Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				
				System.out.println("Add Customer");
				System.out.print("Enter Customer Name :");
				CName=br.readLine();
				System.out.print("Enter Customer EmailID :");
				CEmailid=br.readLine();
				System.out.print("Enter Password :");
				CPassword=br.readLine();
				System.out.print("Enter Mobile Number :");
				CMobNo=sc.nextInt();
				System.out.println("Enter Address");
				CAddr=sc.next();
				
				Customer customer=new Customer(CName,CEmailid,CPassword,CMobNo,CAddr);
				c=ci.addCustomer(customer);
				if(c)
				{
					System.out.println("Added Successfully");
				}
				else
				{
					System.out.println("Failed");
				}
				break;
			
			
			case 2:
				
				System.out.println("Update Customer");
				System.out.println("Enter EmailId : ");
				CEmailid=br.readLine();
				System.out.print("Enter Customer Name :");
				CName=br.readLine();
				System.out.print("Enter Password :");
				CPassword=br.readLine();
				System.out.print("Enter Mobile Number :");
				CMobNo=sc.nextInt();
				System.out.println("Enter Address");
				CAddr=sc.next();
				Customer customerup=new Customer(CName,CEmailid,CPassword,CMobNo,CAddr);
				c=ci.updateCustomer(customerup);
				
				if(c)
				{
					System.out.println("Details Updated ");
				}
				else
				{
					System.out.println("Couldn't Update");
				}
				break;
			case 3:
				System.out.println("Want to Delete Customer ");
				System.out.print("Enter the EmailId :");
				String ce=br.readLine();
	             Customer customerdelete=new Customer();
				
	            customerdelete.setCEmailid(ce);
				
				c=ci.deleteCustomer(ce);
				if(c)
				{
					System.out.println("Customer Deleted");
				}
				else
				{
					System.out.println("\nTry again couldn't delete");
				}
				break;
			case 4:
			
				System.out.print("Enter Email ID :");
				String CEmailid1 =sc.next();
				Customer customersearch=new Customer();
				customersearch=ci.searchbyEmaildID(CEmailid1);
				
	            if(customersearch!=null/*&&sfood.getFoodid()==z*/)
				{
					System.out.println(customersearch);
				}
				else
				{
					System.out.println("Invalid EmailId");
				}
				break;
			case 5:
				List<Customer> customerlist=ci.getAllCustomer();
				Iterator<Customer>it=customerlist.iterator();
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
