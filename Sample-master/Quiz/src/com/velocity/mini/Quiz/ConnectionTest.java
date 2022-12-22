package com.velocity.mini.Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionTest {
	
	 public Connection getconnection() {
		  Connection connection=null;
		  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Questionset", "root", "root");
		 
		  }catch(Exception e)
		  {
			  System.out.println(e);
		  }
		return connection;
	}
}
