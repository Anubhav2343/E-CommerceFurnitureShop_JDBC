package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.furniture.bean.Product;

public class ProductRegisterDAO {
	public boolean insert(Product p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db","root","Edulearn@7861");
		
		PreparedStatement ps=con.prepareStatement("insert into product(productId,productName,price,image) values (?,?,?,?)");
		ps.setInt(1, p.getProductId());
		ps.setString(2, p.getProductName());
		ps.setDouble(3, p.getPrice());
		//ps.setString(3, p.getPrice());
		ps.setString(4, p.getImage());
		
		int res = ps.executeUpdate();
		if(res>0) {
			return true;
		}else {
			return false;
		}
		
	}
}
