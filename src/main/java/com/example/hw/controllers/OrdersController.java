package com.example.hw.controllers;


import com.example.hw.model.Orders;
import com.example.hw.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    OrdersService ordersService;
    @GetMapping("/orders/all")
    public List<Orders> getAllOrders(){
        return ordersService.getAllOrders();
    }


    @GetMapping("/orders/{id}")
    public Orders getById(@PathVariable Integer id){
        return OrdersService.getOrdersById(2);
    }
    //GETTING AN ORDER BY HIS ID


    @PostMapping("/orders/insert")
    public Orders addOrders(){
        return ordersService.addOrders("shipped");
    }

    //ADDING AND UPDATING AN ORDER



    @DeleteMapping("/orders/deleted")
    public void deleteOrders(){
        ordersService.deleteOrders(1);
    }

    //DELETING An Order



}
