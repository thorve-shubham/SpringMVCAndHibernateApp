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
        if(customer != null)
            return customerDAO.saveCustomer(customer);
        else
            return false;
    }

    @Override
    @Transactional
    public Customer getCustomerById(int id) {
        if(id != 0)
            return customerDAO.getCustomerById(id);
        else
            return null;
    }

    @Override
    @Transactional
    public boolean updateCustomer(Customer customer) {
        if(customer !=null ){
            return customerDAO.updateCustomer(customer);
        }
        return false;
    }
}
