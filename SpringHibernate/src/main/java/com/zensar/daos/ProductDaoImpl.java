package com.zensar.daos;

/*
 * Author:Shaily Agrawal
 * Creation Date: 30th jul 2019 15.05 PM
 * Modified Date: 31th July 2019 15:10 PM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents business entity product
 * It is class of product dao impl
 * value object of application
 * domain or application object.
 * It contains  operations for entity product.
 * 
 **/

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;


@Repository

public class ProductDaoImpl implements ProductDao {
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void insert(Product product) {
		hibernateTemplate.save(product);
		// TODO Auto-generated method stub
		
	}

	public void update(Product product) {
		hibernateTemplate.update(product);
		// TODO Auto-generated method stub
		
	}

	public void delete(Product product) {
		hibernateTemplate.delete(product);
		// TODO Auto-generated method stub
		
	}

	public Product getById(int productId) {
		
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productId);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	}
	

}
