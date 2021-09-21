package com.shubham.springApp.daoImplementation;

import com.shubham.springApp.dao.CustomerDAO;
import com.shubham.springApp.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        //creating session
        Session currentSession = sessionFactory.getCurrentSession();
        //creating query to fetch all customers
        Query<Customer> query = currentSession.createQuery("from Customer",Customer.class);
        //Executing the query
        List<Customer> customers = query.getResultList();
        if(customers!=null){
            return customers;
        }
        return null;
    }

    @Override
    public boolean saveCustomer(Customer customer) {
        //creating session
        Session currentSession = sessionFactory.getCurrentSession();
        //saving customer
        currentSession.save(customer);
        return true;
    }
}
