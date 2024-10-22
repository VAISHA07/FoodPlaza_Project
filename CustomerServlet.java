package com.controller;

import java.io.IOException;
import java.util.List;

import com.foodplazza.Dao.CustomerImpl;
import com.foodplazza.pojo.Customer;
import com.foodplazza.pojo.Food;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {

	CustomerImpl custObj= new CustomerImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		String action = req.getParameter("action");
		
		if(action!=null && action.equals("delete")) {
			String emailid=req.getParameter("emailId");
			
			boolean b=custObj.deleteCustomer(emailid);
			if(b) {
				resp.sendRedirect("Success.jsp");
			}
			else 
			{
				resp.sendRedirect("Failed.jsp");
			}
		}
		else {
			List<Customer>l=custObj.getAllCustomer();
			if(l!=null && !(l.isEmpty())) {
				session.setAttribute("cslist", l);
				resp.sendRedirect("CustomerList.jsp");
			}
			else {
				resp.sendRedirect("Failed.jsp");
			}
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		String email1=(String)session.getAttribute("email");
		String pass1=(String)session.getAttribute("pass");
		
		String action = req.getParameter("action");
		String name = req.getParameter("cname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
	    int cont =Integer.parseInt(req.getParameter("cNo"));
	    String addr=req.getParameter("addr");
		
		if(action!=null && action.equals("AddCustomer")) {
			boolean b=custObj.addCustomer(new Customer(name,email,pass,cont,addr));
			if(b) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("Failed.jsp");
			}
		}
		if(action!=null&& action.equals("UpdateCustomer")) {
  		 Customer c=new Customer(name, email1, pass1, cont, addr);
  		boolean b=custObj.updateCustomer(c);
  		  if(b) {
  			  resp.sendRedirect("Success.jsp");
  		  }else {
  			  resp.sendRedirect("Failed.jsp");
  		  }
  	  }
		
	}
}
