package com.example.demo.enConfig;


import org.springframework.stereotype.Component;

import java.io.Serializable;


@Component
public class Student implements Serializable {
    
    private int id;
    private String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){

        System.out.println("hello...........");
    }
}
