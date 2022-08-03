package com.example.hw.repositories;

import com.example.hw.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    public Customer getById(Integer customerId);
    public void delete(Customer customer);
    public Customer save(Customer customer);


}
