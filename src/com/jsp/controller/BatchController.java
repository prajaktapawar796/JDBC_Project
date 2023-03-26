package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class BatchController {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student();
		s1.setId(31);
		s1.setName("Aditya");
		s1.setEmail("Aditys@123");
		s1.setGender("Male");
		s1.setPhone_number(13456789);
		
		Student s2=new Student();
		s2.setId(32);
		s2.setName("Shubham");
		s2.setEmail("shubham@123");
		s2.setGender("Male");
		s2.setPhone_number(14562178);
		
		Student s3=new Student();
		s3.setId(33);
		s3.setName("alok");
		s3.setEmail("alok@123");
		s3.setGender("Male");
		s3.setPhone_number(15723113);
		
		Student s4=new Student();
		s2.setId(34);
		s2.setName("Kiran");
		s2.setEmail("kiran@123");
		s2.setGender("female");
		s2.setPhone_number(17543692);
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		 StudentDao dao=new StudentDao();
	       dao.addMultipleStudents(al);
		
	}

}
