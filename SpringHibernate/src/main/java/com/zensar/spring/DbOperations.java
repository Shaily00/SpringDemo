package com.zensar.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconfig.xml");
        
        ProductService service = ctx.getBean("productServiceImpl",ProductService.class);
       Product product = new Product(1005,"Laptop","Dell",27000.00f);
        //service.create(product);
       service.edit(product);
       Product product2= service.findProductById(1005);
        System.out.println(product2);
       // Product product3 = new Product(1008,"Laptop","Sony",20000.00f);
        
        
      Product product1= new Product();
        product1.setId(1005);
        service.remove(product);
       
        List<Product> productList= service.findAllProducts();
        for(Product p:productList)
        	System.out.println(p);
    }
}
