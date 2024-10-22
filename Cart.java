package com.foodplazza.pojo;

public class Cart {
	int CartId;
	int FoodId;
	String FoodName;
	String EmailId;
    int Price;
    int TotalPrice;
    int Quantity;
	public Cart(int foodId, String foodName, String emailId, int price, int totalPrice, int quantity) {
		super();
		//CartId = cartId;
		FoodId = foodId;
		FoodName = foodName;
		EmailId = emailId;
		Price = price;
		TotalPrice = totalPrice;
		Quantity = quantity;
	}
	public Cart() {
		super();
		
	}
	public int getCartId() {
		return CartId;
	}
	public void setCartId(int cartId) {
		CartId = cartId;
	}
	public int getFoodId() {
		return FoodId;
	}
	public void setFoodId(int foodId) {
		FoodId = foodId;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [CartId=" + CartId + ", FoodId=" + FoodId + ", FoodName=" + FoodName + ", EmailId=" + EmailId
				+ ", Price=" + Price + ", TotalPrice=" + TotalPrice + ", Quantity=" + Quantity + "]";
	}
    
	
}/*
+------------+-------------+------+-----+---------+----------------+
| CartId     | int         | NO   | PRI | NULL    | auto_increment |
| FoodId     | int         | YES  |     | NULL    |                |
| FoodName   | varchar(50) | YES  |     | NULL    |                |
| EmailId    | varchar(50) | YES  |     | NULL    |                |
| Price      | int         | YES  |     | NULL    |                |
| TotalPrice | int         | YES  |     | NULL    |                |
| Quantity   | int         | YES 
*/