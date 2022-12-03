package com.example.cs174project.controller;

import com.example.cs174project.entity.dao.CustomerDAO;
import com.example.cs174project.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @PostMapping("/createCustomer")
    public String insertCustomer(@RequestBody Customer customer) {
        return customerDAO.insertCustomer(customer);
    }

    @DeleteMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam String customerID) {
        return customerDAO.deleteCustomer(customerID);
    }

    @GetMapping("/selectCustomer")
    public String insertCustomer(@RequestParam String customerID) {
        return customerDAO.selectCustomer(customerID);
    }
}
