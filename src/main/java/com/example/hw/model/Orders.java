package com.example.hw.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String status;


    public Orders() {

    }

    public Integer getId() {
        return id;
    }


    public Orders(String status) {
        this.status = status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
