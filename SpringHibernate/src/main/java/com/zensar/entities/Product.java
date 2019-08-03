package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/*
 * Author:Shaily Agrawal
 * Creation Date: 25th jul 2019 11.05 AM
 * Modified Date: 31th July 2019 11:10 AM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents business entity product
 * It is class of entity. It is a persistent class of hibernate
 * value object of application
 * domain or application object.
 * It is a POJO.
 * 
 **/
@Component
@Entity
@Table(name="Product")
public class Product {

	//@GeneratedValue //for auto increment value
	@Id
	
	private int id;
	private String name;
	private String brand;
	private float price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String brand, float price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [Id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	

}
