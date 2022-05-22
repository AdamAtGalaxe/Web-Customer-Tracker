package dev.adamroberts.springdemo.dao;

import java.util.List;

import dev.adamroberts.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
	public Customer getCustomer(int theId);
	public void deleteCustomer(int theId);
}
