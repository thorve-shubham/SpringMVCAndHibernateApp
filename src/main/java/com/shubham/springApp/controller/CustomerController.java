package com.shubham.springApp.controller;

import com.shubham.springApp.dao.CustomerDAO;
import com.shubham.springApp.entity.Customer;
import com.shubham.springApp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/showUpdateForm")
    public String showUpdateCustomerPage(@RequestParam("customerId")int id,Model model){
        Customer customer;
        if(id != 0) {
            customer = customerService.getCustomerById(id);
            model.addAttribute("customer", customer);
            return "showUpdateForm";
        }
        return "404";
    }

    @PostMapping("/updateCustomer")
    public String updateCustomer(@ModelAttribute("customer") Customer customer){
        if(customer != null){
            boolean result = customerService.updateCustomer(customer);
            if(result){
                return "redirect:/customer/list";
            }
            return "404";
        }
        return "404";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int id){
        if(id != 0){
            boolean result = customerService.deleteCustomer(id);
            if(result)
                return "redirect:/customer/list";
            return "404";
        }
        return "404";
    }
}
