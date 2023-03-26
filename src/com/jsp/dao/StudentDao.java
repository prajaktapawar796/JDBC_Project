package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.jsp.dto.Student;
import com.jsp.util.HelperClass;

public class StudentDao {
	
	HelperClass helperClass=new HelperClass();
	Connection connection=null;
		
			//method to save student 
	public void saveStudent(Student student)
	{
		String sql="INSERT INTO student VALUES(?,?,?,?,?)";
		connection=helperClass.getConnection();
		
		
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, student.getId());
				preparedStatement.setString(2, student.getName());
				preparedStatement.setString(3, student.getEmail());
				preparedStatement.setString(4, student.getGender());
				preparedStatement.setLong(5, student.getPhone_number());
				
				preparedStatement.execute();
				System.out.println("All good");
				if(connection!=null)
				{
					connection.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	public void deleteStudentById(int id) {
		String sql="DELETE FROM student WHERE id=?";
		connection=helperClass.getConnection();
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			preparedStatement.execute();
			System.out.println("All good");
			if(connection!=null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateStudent(Student student)
	{
		String sql="UPDATE student SET name=?, email=? WHERE id=?";
		connection=helperClass.getConnection();
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getEmail());
			preparedStatement.setInt(3,student.getId());
			
			int a=preparedStatement.executeUpdate();
			if(a>0)
			{
				System.out.println("Updated");
			}
			else
			{
				System.out.println("Not updated");
			}
			System.out.println("All good");
			if(connection!=null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	//Batch Execution 
	public void addMultipleStudents(List<Student> students)
	{
		Connection connection=helperClass.getConnection();
		String sql="INSERT INTO student VALUES(?,?,?,?,?)";
		PreparedStatement preparedStatement=null;
		//for each loop
		
		for(Student student:students)
		{
			try {
			 preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, student.getId());
				preparedStatement.setString(2, student.getName());
				preparedStatement.setString(3, student.getEmail());
				preparedStatement.setString(4, student.getGender());
				preparedStatement.setLong(5, student.getPhone_number());
				
				preparedStatement.addBatch();
				preparedStatement.executeBatch();
				System.out.println("All good batch");	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	
	

	
	}
}
