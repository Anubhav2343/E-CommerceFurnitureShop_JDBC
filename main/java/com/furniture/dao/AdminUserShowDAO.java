package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.furniture.bean.User;

public class AdminUserShowDAO {
	public ArrayList show() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db", "root", "Edulearn@7861");
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("Select * from User");
		
		ArrayList<User> arr = new ArrayList<>();
		
		while(rs.next()) {
			arr.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		return arr;
	}
}
