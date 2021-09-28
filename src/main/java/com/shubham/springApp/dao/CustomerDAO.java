package com.shubham.springApp.dao;

import com.shubham.springApp.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();
    boolean saveCustomer(Customer customer);
    Customer getCustomerById(int id);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(int id);
}
