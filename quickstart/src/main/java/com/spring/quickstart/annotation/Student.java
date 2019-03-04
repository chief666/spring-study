package com.spring.quickstart.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    @Value("tom")
    private String name;

    @Value("20")
    private int age;

    //使用@Autowired注入一个Phone类型的bean
    @Autowired
    private Phone phone;
}
