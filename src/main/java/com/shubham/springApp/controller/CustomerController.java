package com.shubham.springApp.controller;

import com.shubham.springApp.dao.CustomerDAO;
import com.shubham.springApp.entity.Customer;
import com.shubham.springApp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String getCustomers(Model model){

        List<Customer> customers = customerService.getCustomers();

        model.addAttribute("customers",customers);

        return "list-customer";
    }

    @GetMapping("/add")
    public String addCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "addCustomer";
    }

    @PostMapping("/addCustomer")
    public String addCustomerRequest(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }
}
