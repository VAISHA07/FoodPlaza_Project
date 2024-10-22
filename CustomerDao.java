package com.foodplazza.Dao;

import java.util.List;

import com.foodplazza.pojo.Customer;

public interface CustomerDao {
	boolean addCustomer(Customer customer);
	boolean updateCustomer(Customer customer);
	boolean deleteCustomer(String EmailId);
	Customer searchbyEmaildID(String EmailId);
	List<Customer>getAllCustomer();

}
