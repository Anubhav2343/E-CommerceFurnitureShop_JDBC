package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.furniture.bean.User;

public class UpdateDataUserDAO {
	public boolean updateData(User u) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db","root","Edulearn@7861");
		PreparedStatement ps=con.prepareStatement("update user set username=?, password=? where user_id=? ");
		
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getPassword());
		ps.setInt(3, u.getUserId());
		
		int result= ps.executeUpdate();
		System.out.println(result);
		if(result>0) {
			return true;
		}else {
			return false;
		}
		
	}
}
