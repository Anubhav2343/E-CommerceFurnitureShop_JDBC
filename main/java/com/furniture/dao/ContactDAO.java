package com.furniture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.furniture.bean.Contact;

public class ContactDAO {
	public boolean contact(Contact c) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_db","root","Edulearn@7861");
		
		PreparedStatement ps=con.prepareStatement("insert into contact(name, email, subject, message) values (?,?,?,?)");
		ps.setString(1, c.getName());
		ps.setString(2, c.getEmail());
		ps.setString(3, c.getSubject());
		ps.setString(4, c.getMessage());
		
		int res = ps.executeUpdate();
		if(res>0) {
			return true;
		}else {
			return false;
		}
		
	}
}
