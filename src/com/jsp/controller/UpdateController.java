package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class UpdateController {
	public static void main(String[] args) {
		Student student=new Student();
        student.setName("Prajakta");
        student.setEmail("adam@123");
        student.setId(3);
       StudentDao dao=new StudentDao();
       dao.updateStudent(student);
        
	}
	
}
