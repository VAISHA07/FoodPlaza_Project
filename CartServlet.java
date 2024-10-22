package com.controller;

import java.io.IOException;
import java.util.List;

import com.foodplazza.Dao.CartImpl;
import com.foodplazza.pojo.Cart;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/cart")
public class CartServlet extends HttpServlet{
	
	CartImpl cd=new CartImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String action=req.getParameter("action");
		if(action!=null && action.equals("delete")) {
			int cartId=Integer.parseInt(req.getParameter("cartId"));
			boolean b=cd.deleteCart(cartId);
			if(b) {
				resp.sendRedirect("cart");
			}else {
				resp.sendRedirect("Failed.jsp");
			}
		}else {
			String emailId=(String)session.getAttribute("uEmail");
			
			List<Cart>l=cd.showCart(emailId);
			if(l!=null && !(l.isEmpty())){
				session.setAttribute("clist",l);
				resp.sendRedirect("Cartlist.jsp");
			}else {
				resp.sendRedirect("Failed.jsp");
			}
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String action=req.getParameter("action");
		String fName=(String)session.getAttribute("fName");
		
		if(action!=null && action.equals("AddToCart")) {
			int fid=Integer.parseInt(req.getParameter("fid"));
			String name=req.getParameter("fname");
			String email=req.getParameter("emailid");
			int price=Integer.parseInt(req.getParameter("price"));
			int tprice=Integer.parseInt(req.getParameter("tprice"));
			int quan=Integer.parseInt(req.getParameter("fquan"));
			
			
			
			CartImpl cObj=new CartImpl();
			boolean b=cObj.searchCart(fName);
			
			if(!b) {
				boolean b1=cd.addToCart(new Cart(fid,name,email,price,tprice,quan));
				if(b1)
				{
					resp.sendRedirect("cart");
				}
				else {
					resp.sendRedirect("Failed.jsp");
				}
			}
			else 
			{
				resp.sendRedirect("cart");
			}
		}
	}

}
