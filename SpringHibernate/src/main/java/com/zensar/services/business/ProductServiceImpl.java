package com.zensar.services.business;

/*
 * Author:Shaily Agrawal
 * Creation Date: 30th jul 2019 04.50 PM
 * Modified Date: 31th July 2019 04:50 PM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents business entity product
 * It is impl of product service
 * value object of application
 * domain or application object.
 * It contains CRUD operations for entity product.
 * 
 **/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.ProductDao;
import com.zensar.entities.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	
	@Autowired
	private ProductDao dao;

	public void create(Product product) {
		dao.insert(product);
		// TODO Auto-generated method stub

	}

	public void edit(Product product) {
		Product dbProduct = findProductById(product.getId());
		if(dbProduct!=null)
		{
			dbProduct.setName(product.getName());
			dbProduct.setBrand(product.getBrand());
			dbProduct.setPrice(product.getPrice());
			dao.update(dbProduct);
		}
		else
			System.out.println("Product doesnt exist");
		// TODO Auto-generated method stub

	}

	public void remove(Product product) {
		Product dbProduct = findProductById(product.getId());
		if(dbProduct!=null)
		{
			dao.delete(dbProduct);
		}
		else
			System.out.println("Product doesnt exist");

	}

	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getById(productId);
	}

	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
