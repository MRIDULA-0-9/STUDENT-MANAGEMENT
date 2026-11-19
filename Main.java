package com.sms;

import java.sql.Connection;
import java.sql.SQLException;
import com.sms.controller.StudentController;
import com.sms.util.DBConnection;

public class Main {
		public static void main(String[] args) {
			try {
				Connection con = DBConnection.getConnection();
				if(con != null)
					con.close();
					StudentController controller=new StudentController();
					controller.StartApp();
				}
			catch(SQLException e) {
				System.out.println("DATABASE CONNECTION FAILED");
				e.printStackTrace();
			}
		}
}
