package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.furniture.bean.Product;


public class ProductDeleteDAO {
	public boolean delete(Product p) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db", "root", "Edulearn@7861");
		
		PreparedStatement ps=con.prepareStatement("delete from product where productId=?");
		ps.setInt(1, p.getProductId());
		int res=ps.executeUpdate();
		System.out.println(res);
		
		if(res>0) {
			return true;
		}else {
			return false;
		}
		
	}
}
