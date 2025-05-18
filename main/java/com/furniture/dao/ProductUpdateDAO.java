package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.furniture.bean.Product;

public class ProductUpdateDAO {
	public Product update(Product p) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db","root","Edulearn@7861");
		PreparedStatement ps=con.prepareStatement("Select * from Product where productId=?");
		
		ps.setInt(1, p.getProductId());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			p.setProductId(rs.getInt(1));
			p.setProductName(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			p.setImage(rs.getString(4));
		}
		return p;
	}
}
