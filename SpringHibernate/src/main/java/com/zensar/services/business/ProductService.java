package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Product;

/*
 * Author:Shaily Agrawal
 * Creation Date: 30th jul 2019 15.05 PM
 * Modified Date: 30th July 2019 15:10 PM
 * Version: 3.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents business entity product
 * It is interface of product services
 * value object of application
 * domain or application object.
 *which can be accessed by presentation layer
 *It encapsulates business logic of product entity
 * 
 **/
public interface ProductService {
	void create(Product product);
	void edit(Product product);
	void remove (Product product);
	Product findProductById(int productId);
	List<Product> findAllProducts();
	
	

}
