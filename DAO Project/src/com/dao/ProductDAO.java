package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductDAO implements ProductDaoInterface {

	private Connection createConection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/Pubhub_100", "root", "Pass123$");

	}

	@Override
	public List<Product> getProduct() {
		List<Product> productList = new ArrayList<>();
		try {
			Connection con = createConection();
			String sqlSelectquery = "SELECT * FROM Books_data";
			PreparedStatement ps = con.prepareStatement(sqlSelectquery);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String productName = rs.getString("Product_name");
				String ProductDescription = rs.getString("Product_Descreprion");
				
				Product product = new Product();
				product.setProductName(productName);
				product.setProductDescription(ProductDescription);
				productList.add(product);
				System.out.println("test");
				/*Iterator<Product> iterator = p.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}*/
				for (Product p1 :productList ) {
					System.out.println(p1.getProductName() + " " + p1.getProductDescription());
				}
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

	@Override
	public void addProduct(Product product)  {
try {
		Connection con = createConection();
		String sqlInsertQuery = "INSERT INTO books_data(`Product_Name`,`Product_Descreprion`) VALUES(?,?)";
		PreparedStatement ps = con.prepareStatement(sqlInsertQuery);
		ps.setString(1, product.getProductName());
		ps.setString(2, product.getProductDescription());
		ps.executeUpdate();
		System.out.println("inserted successfully");
	}catch (Exception e) {
		// TODO: handle exception

	}
}
	

	@Override
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void UpdateProduct(Product product) {
		// TODO Auto-generated method stub

	}

}
