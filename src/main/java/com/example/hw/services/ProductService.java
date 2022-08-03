package com.example.hw.services;

import com.example.hw.model.Customer;
import com.example.hw.model.Orders;
import com.example.hw.model.Product;
import com.example.hw.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        List<Product> aux1 = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(aux1::add);
        return aux1;
    }

    public Product getProductById(Integer id){
        return productRepository.findById(id).get();
    }

    public Product addProduct(String name, Double price){
        return productRepository.save(new Product(name, price));
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

}
