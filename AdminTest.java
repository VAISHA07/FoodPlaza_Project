package com.foodplazza.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.foodplazza.Dao.AdminImpl;
import com.foodplazza.Dao.OrderImpl;
import com.foodplazza.pojo.Admin;

public class AdminTest {

	public static void main(String[] args) throws IOException {
		String EmailID;
		String Password;
		
		Scanner sc=new Scanner(System.in);
		AdminImpl adi= new AdminImpl();
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		boolean a;
        
		System.out.println("1.User Login\n2.Change User Password\n3.Admin Login\n4.Admin Change Password\n5.Exit\n\n_Enter your choice_");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.print("Enter EmailID : ");
			EmailID=br.readLine();
			System.out.print("Enter Password : ");
			Password=br.readLine();
			 a=adi.userLogin(EmailID, Password);
			if(a)
			{
				System.out.println("\nLogin Successfully");
			}
			else {
				System.out.println("Incorrect EmailID || Incorrect Password ");
			}
			break;
				
		case 2 :
		
	        System.out.print("Enter EmailID : ");
			EmailID=br.readLine();
			System.out.print("Enter new Password : ");
			Password=br.readLine();
			 a=adi.userChangePassword(EmailID, Password);
			if(a)
			{
				System.out.println("\nPassword updated Successfully");
			}
			else {
				System.out.println("Incorrect EmailID ");
				}
			break;
		case 3:
			System.out.print("Enter Admin EmailID : ");
			EmailID=br.readLine();
			System.out.print("Enter Admin  Password : ");
			Password=br.readLine();
			 a=adi.adminLogin(EmailID, Password);
			if(a)
			{
				System.out.println("\nLogin Successfully");
			}
			else {
				System.out.println("Incorrect EmailID || Incorrect Password ");
			}
			break;
				
		case 4 :
			
	        System.out.print("Enter Admin EmailID : ");
			EmailID=br.readLine();
			System.out.print("Enter new Password : ");
			Password=br.readLine();
			 a=adi.adminChangePassword(EmailID, Password);
			if(a)
			{
				System.out.println("\nPassword updated Successfully");
			}
			else {
				System.out.println("Incorrect EmailID ");
				}
			break;
		case 5 :
			 System.exit(0);
		       break;
		default:
				System.out.println("Invalid Choice");
			
		}
	}

}
