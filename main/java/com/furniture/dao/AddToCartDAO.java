package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.furniture.bean.AddToCart;
import com.furniture.bean.Product;

public class AddToCartDAO {
public boolean addTocart(AddToCart atc) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db","root","Edulearn@7861");
		
		PreparedStatement ps=con.prepareStatement("insert into AddToCart(productId,productName,price,image) values (?,?,?,?)");
		ps.setInt(1, atc.getProductId());
		ps.setString(2, atc.getProductName());
		ps.setDouble(3, atc.getPrice());
		ps.setString(4, atc.getImage());
		
		int res = ps.executeUpdate();
		if(res>0) {
			return true;
		}else {
			return false;
		}
		
	}

public ArrayList showAddToCart() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db","root","Edulearn@7861");
	
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("Select * from AddToCart");
	ArrayList<AddToCart> list = new ArrayList<AddToCart>();
	while(rs.next()) {
		list.add(new AddToCart(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4)));
		}
	return list;
	}
}
