package com.sms.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			String url = "jdbc:mysql://localhost:3306/databasename";
			String username = "root";
			String password = "password";
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Database connected successfully");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return con;
		
	}

}
