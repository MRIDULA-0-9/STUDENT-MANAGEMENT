package com.sms.controller;

import com.sms.service.*;
import java.util.Scanner;
import com.sms.model.*;
import java.util.List;
public class StudentController {
	StudentService service=new StudentService();
	Scanner ref=new Scanner(System.in);
	
	public void StartApp() {
		while(true) {
			System.out.println("\n===StudentManagementSystem===\n");
			System.out.println("1.AddStudent");
			System.out.println("2.ViewStudent");
			System.out.println("3.SearchStudent");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice");
			int choice=ref.nextInt();
			
			switch(choice) {
			case 1:
				AddStudent();
				break;
			case 2:
				//ViewStudent();
				break;
			case 3:
				//SearchStudent();
				break;
			case 4:
				System.out.println("Thank you!");
				return;
			default:
				System.out.println("Invalid Choice");
			
			}
		}
	}
	public void AddStudent() {
			System.out.println("Enter Id");
			int Id=ref.nextInt();
			ref.nextLine();
			System.out.println("Enter Name");
			String Name=ref.nextLine();
			System.out.println("Enter Department");
			String Department=ref.nextLine();
			System.out.println("Enter Email");
			String Email=ref.nextLine();
			System.out.println("Enter PhoneNumber");
			long Number=ref.nextLong();
			
			Student student=new Student(Id,Name,Department,Email,Number);
			boolean result=service.addStudent(student);
			if(result) {
				System.out.println("Student added successfully");
			}
			
	}
//	public void ViewStudent() {
//		List<Student>student=service.findAll();
//		if(student.isEmpty()) {
//			System.out.println("No data");
//		}
//		else {
//			System.out.println(student);
//		}
//	}
//	public void SearchStudent() {
//		System.out.println("Enter student Id");
//		int id=ref.nextInt();
//		
//		Student student=service.findById(id);
//		if(student != null) {
//			System.out.println(student);
//		}
//		else {
//			System.out.println("Not available");
//		}
//	}
	
}
