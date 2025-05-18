package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.furniture.bean.Product;

public class ProductShowDAO {
	public ArrayList showProduct() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db","root","Edulearn@7861");
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Product");
		
		ArrayList<Product> list = new ArrayList<Product>();
		while(rs.next()) {
			list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4)));
		}
		return list;
	}
}
