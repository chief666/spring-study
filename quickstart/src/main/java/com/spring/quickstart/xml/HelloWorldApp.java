package com.spring.quickstart.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {
    public static void main(String[] args) {
        //读入配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
        //读取配置好的bean
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
        //helloworld运行
        System.out.println(HelloWorld.getHello());
    }
}
