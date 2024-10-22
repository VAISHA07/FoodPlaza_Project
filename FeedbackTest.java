package com.foodplazza.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodplazza.Dao.FeedbackImpl;
import com.foodplazza.pojo.Feedback;
import com.foodplazza.pojo.Food;

public class FeedbackTest {
	String Name;
	String EmailId;
	String Review;
	int Rank;
	String Suggestion;
	
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FeedbackImpl feedI=new FeedbackImpl();
		System.out.println("Enter your choice");
	     int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		System.out.print("Enter your name : ");
		 String name=sc.next();
		System.out.print("Enter your EmailId: ");
		 String emailid=sc.next();
		 System.out.print("Enter your Review : ");
		 String review=sc.next();
		 System.out.print("Enter your Rank : ");
		 int rank=sc.nextInt();
		 System.out.print("Enter your Suggestion : ");
		 String sugg=sc.next();
		 
		 Feedback feed=new Feedback(name,emailid,review,rank,sugg);
        boolean b=feedI.addFeedback(feed);
         if(b) {
        	 System.out.println("Added");
         }
         else {
        	 System.out.println("Failed");
         }
         break;
		case 2:
			List<Feedback> feedlist=feedI.getAllFeedback();
			Iterator<Feedback>it=feedlist.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			break;
	}
	}

}
