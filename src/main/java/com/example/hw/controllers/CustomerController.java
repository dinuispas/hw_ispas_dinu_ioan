package com.example.hw.controllers;

import com.example.hw.model.Customer;
import com.example.hw.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;



    @GetMapping("/customers/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

//    @GetMapping("/{id}")
//    public Customer getById(@PathVariable Integer id){
//        return customerService.getCustomerById(2);
//    }
    //GETTING A CUSTOMER BY HIS ID


//    @PostMapping("/customers/insert")
//    public Customer addCustomer(){
//        return customerService.addCustomer("abc@gmail.com", "cristi");
//    }

    //ADDING AND UPDATING A CUSTOMER



//    @DeleteMapping("/customers/deleted")
//    public void deleteCustomer(){
//        customerService.deleteCustomer(1);
//    }

    //DELETING A CUSTOMER






}
