package com.moain;

import java.util.List;

import com.dao.ProductDAO;
import com.model.Product;

public class ProductMain {
	 static int i=1;
	public static void main(String[] args) {
		Product product = new Product();
		product.setProductName("asasa");
		product.setProductDescription("sasasasas");
		ProductDAO productDAO = new ProductDAO();
		 productDAO.getProduct();
		
		// productDAO.addProduct(product);
	}
}
