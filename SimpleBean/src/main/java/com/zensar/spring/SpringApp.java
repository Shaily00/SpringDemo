package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringApp 
{
    public static void main( String[] args )
    {
    	//spring ioc conatiner object
      ApplicationContext ctx = new ClassPathXmlApplicationContext("Greetings.xml");
      
      //obtaining readymade object from spring ioc container
      Greeting g1 = ctx.getBean("birthday", Greeting.class);
      
      // invoking business logic method
      System.out.println(g1.sayGreet());
      
  Greeting g2 = ctx.getBean("holi", Greeting.class);
      
      // invoking business logic method
      System.out.println(g2.sayGreet());
      
      
      Greeting g3 = ctx.getBean("birthday",Greeting.class);
      
    }
}
