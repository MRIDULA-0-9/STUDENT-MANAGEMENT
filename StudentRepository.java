package com.sms.repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.sms.model.*;
import com.sms.util.DBConnection;

public class StudentRepository {
		private List<Student> students=new ArrayList<>();
		public boolean addStudent(Student student) {
			String sql="Insert into student values(?,?,?,?,?)";
			try(Connection con=DBConnection.getConnection();
					PreparedStatement ps=con.prepareStatement(sql)){
				ps.setInt(1, student.getId());
				ps.setString(2, student.getName());
				ps.setString(3, student.getDepartment());
				ps.setString(4, student.getEmail());
				ps.setLong(5, student.getPhoneNumber());
				ps.executeUpdate();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			return false;
//			students.add(student);
//			return true;
//		}
//		public List<Student> findAll(){
//			return students;
//		}
//		public Student findById(int id) {
//			for(Student student:students) {
//				if(((Student)students).getId()==id) {
//					return student;
//				}
//			}
//			return null;
		}
}










