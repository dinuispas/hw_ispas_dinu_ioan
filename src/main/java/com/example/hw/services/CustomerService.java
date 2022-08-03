package com.example.hw.services;


import com.example.hw.model.Customer;
import com.example.hw.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {


    @Autowired
    CustomerRepository customerRepository;


    public List<Customer> getAllCustomers(){
        List<Customer> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }


    public Customer getCustomerById(Integer id){
        return customerRepository.findById(id).get();
    }

    public Customer addCustomer(String email, String name){
        return customerRepository.save(new Customer(email, name));
    }

    public void deleteCustomer(Integer id){
        customerRepository.deleteById(id);
    }


}
