package com.controller;

import java.io.IOException;


import com.foodplazza.Dao.CartImpl;
import com.foodplazza.Dao.OrderImpl;
import com.foodplazza.pojo.Order;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	OrderImpl od=new OrderImpl();
	CartImpl cd=new CartImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession();
		String email=(String)session.getAttribute("uEmail");
		Order o=od.placeOrder(email);
		if(o!=null) {
			boolean b=cd.ClearCartbyEamilId(email);
			if(b) {
				req.setAttribute("order", o);
				req.getRequestDispatcher("Bill.jsp").forward(req, resp);
			}
		}else {
			resp.sendRedirect("Failed.jsp");
		}
	}

}
