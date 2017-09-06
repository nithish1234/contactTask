package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

public class SampleClass {

	public static void main(String args[]) {

		try {
			
			File imgfile = new File("C:\\Users\\Mvision\\Downloads\\download.png");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_database", "root",
					"Pass123$");

			FileInputStream fin = new FileInputStream(imgfile);

			PreparedStatement pre = con.prepareStatement("insert into user_image_table (name,image) values(?,?)");

			pre.setString(1, "test");
			pre.setBinaryStream(2, (InputStream) fin);
			pre.executeUpdate();
			System.out.println("Successfully inserted the file into the database!");

			pre.close();
		
		} 
		catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_database", "root",
					"Pass123$");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select image from user_image_table");
			int i = 0;
			while (rs.next()) {
				InputStream in = rs.getBinaryStream(1);
				OutputStream f = new FileOutputStream(new File("../test"+i+".jpg"));
				i++;
				int c = 0;
				while ((c = in.read()) > -1) {
					f.write(c);
				}
				f.close();
				in.close();
			}
			System.out.println("retrived successfully");
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
