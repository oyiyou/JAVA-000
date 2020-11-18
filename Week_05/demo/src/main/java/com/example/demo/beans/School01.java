package com.example.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class School01 {
    @Bean
    public School01 getSchool01(){
        School01 school01 = new School01();
        return school01;
    }
}
