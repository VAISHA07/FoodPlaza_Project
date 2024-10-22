package com.foodplazza.Dao;

import java.util.List;

import com.foodplazza.pojo.Order;

public interface OrderDao {
	Order placeOrder(String EmailId);
	List<Order>displayorder();

}
