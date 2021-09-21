package com.shubham.springApp.dao;

import com.shubham.springApp.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();
    public boolean saveCustomer(Customer customer);
    public Customer getCustomerById(int id);
    public boolean updateCustomer(Customer customer);
}
