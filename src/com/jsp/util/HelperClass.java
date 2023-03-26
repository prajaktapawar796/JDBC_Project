package com.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass{

	
		// TODO Auto-generated method stub

		
		String url ="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password ="root";
		public Connection getConnection()
		{
		
		Connection connection=null;
		try
		{
			//Load /Register the drive
			Class.forName("com.mysql.cj.jdbc.Driver");
			//To establish the connection
			
			connection =DriverManager.getConnection(url,username,password);
			//Create the statement
			
		
			//Execute the statement
		
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return connection;
	}

}
