package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.furniture.bean.Product;
import com.furniture.bean.User;

public class AdminProductShowDAO {
	public ArrayList show() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db", "root", "Edulearn@7861");
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("Select * from Product");
		
		ArrayList<Product> arr = new ArrayList<>();
		
		while(rs.next()) {
			arr.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4)));
		}
		return arr;
	}
}
