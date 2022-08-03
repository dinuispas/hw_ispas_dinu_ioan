package com.example.hw.services;

import com.example.hw.model.Customer;
import com.example.hw.model.Orders;
import com.example.hw.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {

    @Autowired
    OrdersRepository ordersRepository;

    public List<Orders> getAllOrders(){
        List<Orders> aux1 = new ArrayList<>();
        ordersRepository.findAll().iterator().forEachRemaining(aux1::add);
        return aux1;
    }

    public static Orders getOrdersById(Integer id){
        return ordersRepository.findById(id).get();
    }

    public Orders addOrders(String status){
        return ordersRepository.save(new Orders(status));
    }

    public void deleteOrders(Integer id){
        ordersRepository.deleteById(id);
    }

}
