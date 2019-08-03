package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring.config.GreetingConfig;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(GreetingConfig.class);
       Greeting gx= ctx.getBean("birthdayGreet",Greeting.class);
       System.out.println(gx.sayGreet());
    }
}
