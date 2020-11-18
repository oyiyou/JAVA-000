package com.example.demo.beans;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class School{
    
 private int id;

 private int name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
