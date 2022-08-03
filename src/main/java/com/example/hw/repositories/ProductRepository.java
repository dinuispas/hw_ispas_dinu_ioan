package com.example.hw.repositories;

import com.example.hw.model.Customer;
import com.example.hw.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    public Product getProductsById(String productId);

    public void delete(Product product);
    public Product save(Product product);

}
