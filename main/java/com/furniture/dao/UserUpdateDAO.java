package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.furniture.bean.User;

public class UserUpdateDAO {

	public User update(User u) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db","root","Edulearn@7861");
		PreparedStatement ps=con.prepareStatement("Select * from User where user_id=?");
		
		ps.setInt(1, u.getUserId());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			u.setUserId(rs.getInt(1));
			u.setUsername(rs.getString(2));
			u.setPassword(rs.getString(3));
		}
		return u;
	}

}
