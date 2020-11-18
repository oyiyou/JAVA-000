package com.example.demo.enConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "student")
public class StudentProperties {
    private static final int ID = 1;
    private static final String NAME = "测试人员";

    private int id = ID;
    private String name = NAME;
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
}
