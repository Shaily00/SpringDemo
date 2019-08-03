package com.zensar.daos;
/*
 * Author:Shaily Agrawal
 * Creation Date: 25th jul 2019 15.05 PM
 * Modified Date: 30th July 2019 15:10 PM
 * Version: 3.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents business entity product
 * It is interface of product dao
 * value object of application
 * domain or application object.
 * It contains CRUD operations for entity product.
 * 
 **/
import java.util.List;

 

import com.zensar.entities.Product;

public interface ProductDao {
	
	
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	
	Product getById(int productId);
	List<Product> getAll();

}
