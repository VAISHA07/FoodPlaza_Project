package com.foodplazza.pojo;

public class Order {
	int OrderId;
	String EmailId;
	int TotalPrice;
	String DATE;
	public Order(String emailId, int totalPrice, String date) {
		super();
		//OrderId = orderId;
		EmailId = emailId;
		TotalPrice = totalPrice;
		this.DATE = date;
	}
	public Order() {
		super();
		
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public int getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}
	public String getDate() {
		return DATE;
	}
	public void setDate(String date) {
		this.DATE = date;
	}
	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", EmailId=" + EmailId + ", TotalPrice=" + TotalPrice + ", date=" + DATE
				+ "]";
	}
	
	
}
    