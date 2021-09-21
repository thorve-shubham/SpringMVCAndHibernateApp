package com.shubham.springApp.serviceImplementation;

import com.shubham.springApp.dao.CustomerDAO;
import com.shubham.springApp.entity.Customer;
import com.shubham.springApp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public boolean saveCustomer(Customer customer) {
        return customerDAO.saveCustomer(customer);
    }
}
