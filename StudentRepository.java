package com.sms.repository;


import java.util.ArrayList;
import java.util.List;
import com.sms.model.*;

public class StudentRepository {
		private List<Student> students=new ArrayList<>();
		public boolean addStudent(Student student) {
			students.add(student);
			return true;
		}
		public List<Student> findAll(){
			return students;
		}
		public Student findById(int id) {
			for(Student student:students) {
				if(((Student)students).getId()==id) {
					return student;
				}
			}
			return null;
		}
}










