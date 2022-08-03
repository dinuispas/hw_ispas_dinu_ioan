package com.example.hw.model;


import com.sun.istack.NotNull;
import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotNull
    String email;
    String name;

    public Customer() {

    }

    public Customer(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
