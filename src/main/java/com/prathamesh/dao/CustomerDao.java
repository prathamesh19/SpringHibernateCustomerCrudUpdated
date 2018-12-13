package com.prathamesh.dao;

import java.util.List;

import com.prathamesh.entity.Customer;

public interface CustomerDao {

	boolean addCustomer(Customer customer);
	boolean updateCustomer(Customer customer);
	boolean deleteCustomer(int customerId);
	Customer getCustomer(int customerId);
	List<Customer> getAllCustomers();
	
	
}
