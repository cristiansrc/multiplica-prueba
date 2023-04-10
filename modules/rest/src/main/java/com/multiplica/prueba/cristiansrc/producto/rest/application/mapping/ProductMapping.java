package com.multiplica.prueba.cristiansrc.producto.rest.application.mapping;

import com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb;
import com.multiplica.prueba.cristiansrc.producto.rest.application.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductMapping {
	
	public static List<Product> dbToListProduct(List<ProductDb> productDbs){
		
		List<Product> products = new ArrayList<>();
		
		for(ProductDb productDb: productDbs) {
			products.add(dbToProduct(productDb));
		}
		
		return products;
	}

	public static Product dbToProduct(ProductDb productDb) {
		Product product = new Product();
		
		product.setId(productDb.getId());
		product.setName(productDb.getName());
		product.setDescription(productDb.getDescription());
		
		return product;
	}

}
