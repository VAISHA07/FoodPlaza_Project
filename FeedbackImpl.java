package com.foodplazza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.foodplazza.Utility.DButility;
import com.foodplazza.pojo.Feedback;

public class FeedbackImpl implements FeedbackDao {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int row;
	@Override
	public boolean addFeedback(Feedback fd) {
		try {
		con=DButility.getConnect();
		ps=con.prepareStatement("insert into Feedback(Name,EmailId,Review,Rank1,Suggestion)values(?,?,?,?,?)");
		ps.setString(1,fd.getName());
		ps.setString(2,fd.getEmailId());
		ps.setString(3,fd.getReview());
		ps.setInt(4,fd.getRank1());
		ps.setString(5,fd.getSuggestion());
		
		 row = ps.executeUpdate();
		if(row>0) {
			return true;
		}else {
			return false;
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		return false;
	}
	@Override
	public List<Feedback> getAllFeedback() {
		List<Feedback>l=new ArrayList<>();
		try {
		con=DButility.getConnect();
		ps=con.prepareStatement("select * from Feedback");
		rs=ps.executeQuery();
		while(rs.next()) {
			Feedback f=new Feedback();
			f.setName(rs.getString("Name"));
			f.setEmailId(rs.getString("EmailId"));
			f.setReview(rs.getString("Review"));
			f.setRank1(rs.getInt("Rank1"));
			f.setSuggestion(rs.getString("Suggestion"));
			
			l.add(f);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		return l;
	}
	
	

}
