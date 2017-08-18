package com.salesnow.dao;

import java.util.List;

import com.salesnow.entity.Customer;

public interface CustomerDAO {
	
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(long customerId);
	public Customer getCustomer(long customerId);
	public List<Customer> getCustomers();

}
