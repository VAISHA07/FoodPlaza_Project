package com.foodplazza.Dao;

import java.util.List;

import com.foodplazza.pojo.Cart;

public interface CartDao {
	boolean addToCart(Cart cart);
	 boolean deleteCart(int cartid);
	 boolean ClearCartbyEamilId(String EmailId);
	 boolean searchCart(String foodName);
	 boolean updateQun(Cart cart);
	 List<Cart>showCart(String EmailId);

}
