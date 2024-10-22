package com.controller;

import java.io.IOException;
import java.util.List;

import com.foodplazza.Dao.FoodImpl;
import com.foodplazza.pojo.Food;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/fOOd")
public class FoodServlet extends HttpServlet {
	FoodImpl fd=new FoodImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		String action=req.getParameter("action");
		if(action!=null && action.equals("delete")) {
			int foodId=Integer.parseInt(req.getParameter("foodid"));
			boolean b=fd.deleteFoodById(foodId);
			if(b) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("Failed.jsp");
			}
		}else {
				List<Food>l=fd.getAllFood();
				if(l!=null && !(l.isEmpty())) {
					session.setAttribute("flist",l);
					resp.sendRedirect("FoodList.jsp");
				}else {
					resp.sendRedirect("Failed.jsp");
				}
			}
		}
      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  HttpSession session=req.getSession();
    	  String action=req.getParameter("action");
    	  String name=req.getParameter("fname");
    	  String type=req.getParameter("ftype");
    	  int quan=Integer.parseInt(req.getParameter("fquan"));
    	 int price=Integer.parseInt(req.getParameter("fprice"));
    	  if(action!=null&& action.equals("AddFood")) {
    		  boolean b=fd.addFood(new Food(name,type,quan,price));
    		  if(b) {
    			  resp.sendRedirect("Success.jsp");
    		  }else {
    			  resp.sendRedirect("Failed.jsp");
    		  }
    	  }
    	  if(action!=null&& action.equals("UpdateFood")) {
    		  int fid=Integer.parseInt(req.getParameter("fid"));
    		 Food f= new Food(name,type,quan,price);
    		 f.setFoodid(fid);
    		 boolean b=fd.updateFoodById(f);
    		  if(b) {
    			  resp.sendRedirect("Success.jsp");
    		  }else {
    			  resp.sendRedirect("Failed.jsp");
    		  }
    	  }
    	  
    }
}
