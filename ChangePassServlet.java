package com.controller;

import java.io.IOException;

import com.foodplazza.Dao.AdminImpl;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/vs")
public class ChangePassServlet extends HttpServlet {
	AdminImpl ad=new AdminImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		HttpSession session=req.getSession(false);
		String uEmail=(String)session.getAttribute("uEmail");
		String aEmail=(String)session.getAttribute("aEmail");
		String npass=req.getParameter("cpass");
		
		if(email.equals(uEmail)) {
			boolean b1=ad.userChangePassword(email, npass);
			if(b1) {
				resp.sendRedirect("Success.jsp");
			}else {
				resp.sendRedirect("Failed.jsp");
			}
		}
		if(email.equals(aEmail)) {
			boolean b1=ad.adminChangePassword(email, npass);
			if(b1) {
				resp.sendRedirect("Success.jsp");
			}else {
				resp.sendRedirect("Failed.jsp");
			}
		}
	}

}
