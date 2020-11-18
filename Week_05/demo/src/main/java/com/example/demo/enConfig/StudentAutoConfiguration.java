package com.example.demo.enConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude = StudentProperties.class)
@ConditionalOnClass(StudentProperties.class)
@ConditionalOnProperty(prefix = "student",value = "enable",matchIfMissing = true)
public class StudentAutoConfiguration {
    @Autowired
    private StudentProperties studentProperties;

    @Bean
    @ConditionalOnMissingBean(Student.class)
    public Student getStudent(){
        Student student = new Student();
        student.setId(studentProperties.getId());
        student.setName(studentProperties.getName());
        return student;
    }
}
