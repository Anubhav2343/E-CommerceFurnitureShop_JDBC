package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.furniture.bean.Product;

public class UpdateDataProductDAO {
	public boolean updateData(Product p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db","root","Edulearn@7861");
		PreparedStatement ps=con.prepareStatement("update product set productName=?, price=?, image=? where productId=? ");
		
		ps.setString(1, p.getProductName());
		ps.setDouble(2, p.getPrice());
		ps.setString(3, p.getImage());
		
		int result= ps.executeUpdate();
		System.out.println(result);
		if(result>0) {
			return true;
		}else {
			return false;
		}
	}
}
