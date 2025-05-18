package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.furniture.bean.User;

public class UserDeleteDAO {
	public boolean delete(User u) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db", "root", "Edulearn@7861");
		
		PreparedStatement ps=con.prepareStatement("delete from user where user_id=?");
		ps.setInt(1, u.getUserId());
		int res=ps.executeUpdate();
		System.out.println(res);
		
		if(res>0) {
			return true;
		}else {
			return false;
		}
		
	}
}
