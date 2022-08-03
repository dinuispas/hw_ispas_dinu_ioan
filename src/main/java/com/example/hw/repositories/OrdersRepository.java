package com.example.hw.repositories;

import com.example.hw.model.Customer;
import com.example.hw.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {

    public List<Orders> findAll();
    public Orders getById(Integer ordersId);
    public void delete(Orders orders);
    public Orders save(Orders orders);

}
