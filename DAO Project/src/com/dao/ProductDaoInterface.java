package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDaoInterface {
	List<Product> getProduct();
public void addProduct(Product product);
public void deleteProduct(Product product);
public void UpdateProduct(Product product);

}
