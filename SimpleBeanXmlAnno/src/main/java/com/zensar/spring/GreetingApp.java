package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
      ApplicationContext ctx= new ClassPathXmlApplicationContext("greetings.xml");
    /*  Greeting gf= ctx.getBean("festivalGreeting",Greeting.class);* if no bean id is given class name in camel case*/
      
      Greeting gf= ctx.getBean("festiveGreeting",Greeting.class); // if component name is given use that
      System.out.println(gf.sayGreet());
    }
}
