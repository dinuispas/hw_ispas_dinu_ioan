package com.example.hw.controllers;


import com.example.hw.model.Customer;
import com.example.hw.model.Product;
import com.example.hw.services.CustomerService;
import com.example.hw.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/products/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }


    @GetMapping("/products/{id}")
    public Product getById(@PathVariable Integer id){
        return productService.getProductById(2);
    }
    //GETTING A Product BY HIS ID


    @PostMapping("/products/insert")
    public Product addProduct(){
        return productService.addProduct("abc@gmail.com", 200.0);
    }

    //ADDING AND UPDATING A Product



    @DeleteMapping("/products/deleted")
    public void deleteProduct(){
        productService.deleteProduct(1);
    }

    //DELETING A Product



}
