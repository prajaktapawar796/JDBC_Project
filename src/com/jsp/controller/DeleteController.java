package com.jsp.controller;

import com.jsp.dao.StudentDao;

public class DeleteController {
public static void main(String[] args) {
	StudentDao studentDao=new StudentDao();
	studentDao.deleteStudentById(1);
}
}
