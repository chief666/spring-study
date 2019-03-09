package com.spring;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

/*用户自定义的前置增强类*/
public class MyBeforeAdvice {
    /*private static final Logger logger = LoggerFactory.getLogger(MyBeforeAdvice.class);*/
    /*定义前置方法*/
   public void beforeMethod(){
        System.out.println("this is a before method");
    }
  /* public void connectDB(){

   }*/
}
