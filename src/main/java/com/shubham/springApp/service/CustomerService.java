package com.shubham.springApp.service;

import com.shubham.springApp.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();
    public boolean saveCustomer(Customer customer);
}
