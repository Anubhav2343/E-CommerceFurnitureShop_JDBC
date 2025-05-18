package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.furniture.bean.User;

public class UserRegisterDAO {
	public boolean register(User u) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db","root","Edulearn@7861");
		
		PreparedStatement ps=con.prepareStatement("insert into user(username,password) values (?,?)");
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getPassword());
		
		int res=ps.executeUpdate();
		if(res>0) {
			return true;
		}else {
			return false;
		}
		
	}
}
