package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MaxApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/application");
        Max max = (Max) context.getBean("max");
        System.out.println(max.getMax());
    }
}
