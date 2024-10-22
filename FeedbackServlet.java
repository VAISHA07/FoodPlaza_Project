package com.controller;

import java.io.IOException;
import java.util.List;

import com.foodplazza.Dao.FeedbackImpl;
import com.foodplazza.pojo.Feedback;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {
FeedbackImpl fd=new FeedbackImpl();

@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		List<Feedback>l=fd.getAllFeedback();
		if(l!=null && !(l.isEmpty())) {
			session.setAttribute("fdlist",l);
			resp.sendRedirect("Feedbacklist.jsp");
		}
		else {
			resp.getWriter().print(1);
		}
	}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession();
	String email=(String)session.getAttribute("uEmail");
	String action = req.getParameter("action");
	
	if(action!=null&& action.equals("AddFeedback")) {
		String name=req.getParameter("cname");
		String review=req.getParameter("review");
		int rank=Integer.parseInt(req.getParameter("rank"));
		String sug=req.getParameter("sug");
		
		boolean b=fd.addFeedback(new Feedback(name,email,review,rank,sug));
		if(b) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("Failed.jsp");
		}
	}
}
}
