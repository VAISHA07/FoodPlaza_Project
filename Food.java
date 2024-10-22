package com.foodplazza.pojo;

public class Food {
	int foodid;
	String foodname;
	String foodtype;
	int  foodquantity;
	int foodprice;
	public Food(String foodname, String foodtype, int foodquantity, int foodprice) {
		
		//this.foodid = foodid;
		this.foodname = foodname;
		this.foodtype = foodtype;
		this.foodquantity = foodquantity;
		this.foodprice = foodprice;
	}
	public Food() {
		super();
	}
	
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}
	public int getFoodquantity() {
		return foodquantity;
	}
	public void setFoodquantity(int foodquantity) {
		this.foodquantity = foodquantity;
	}
	public int getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(int foodprice) {
		this.foodprice = foodprice;
	}
	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", foodname=" + foodname + ", foodtype=" + foodtype + ", foodquantity="
				+ foodquantity + ", foodprice=" + foodprice + "]";
	}
	
	
	
}
