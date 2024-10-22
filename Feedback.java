package com.foodplazza.pojo;



public class Feedback {
	String Name;
	String EmailId;
	String Review;
	int Rank1;
	String Suggestion;
	public Feedback(String name, String emailId, String review, int rank, String suggestion) {
		super();
		Name = name;
		EmailId = emailId;
		Review = review;
		Rank1 = rank;
		Suggestion = suggestion;
	}
	public Feedback() {
		super();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getReview() {
		return Review;
	}
	public void setReview(String review) {
		Review = review;
	}
	public int getRank1() {
		return Rank1;
	}
	public void setRank1(int rank) {
		Rank1 = rank;
	}
	public String getSuggestion() {
		return Suggestion;
	}
	public void setSuggestion(String suggestion) {
		Suggestion = suggestion;
	}
	@Override
	public String toString() {
		return "Feedback [Name=" + Name + ", EmailId=" + EmailId + ", Review=" + Review + ", Rank=" + Rank1
				+ ", Suggestion=" + Suggestion + "]";
	}
	
	

}
