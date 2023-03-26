package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student=new Student();
		student.setId(6);
		student.setName("Praju");
		student.setEmail("Praju@123");
		student.setGender("female");
		student.setPhone_number(123876778);
		
		
		student.setId(7);
		student.setName("kajal");
		student.setEmail("Praju@123");
		student.setGender("female");
		student.setPhone_number(1274876778);
		
		student.setId(8);
		student.setName("gauri");
		student.setEmail("Praju@123");
		student.setGender("female");
		student.setPhone_number(123456788);
		
		student.setId(9);
		student.setName("gauri");
		student.setEmail("Praju@123");
		student.setGender("female");
		student.setPhone_number(183456978);
		student.setId(10);
		student.setName("gauri");
		student.setEmail("Praju@123");
		student.setGender("female");
		student.setPhone_number(126456788);
		
		
		StudentDao studentdao=new StudentDao();
		
		studentdao.saveStudent(student);
		
		 
	}


}
