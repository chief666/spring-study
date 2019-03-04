package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserLoginApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
        UserLogin userLogin = (UserLogin)context.getBean("userlogin");
        System.out.println(userLogin);
    }
}
