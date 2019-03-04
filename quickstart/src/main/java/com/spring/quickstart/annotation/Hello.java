package com.spring.quickstart.annotation;

import org.springframework.stereotype.Component;

/*
*采用注解开发的bean
* @Component用于级别注解，标注本类为一个可以被spring容器托管的bean
**/
@Component("hello")
public class Hello {
    public String getHello(){
        return "Hello world";
    }
}
