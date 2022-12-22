package com.velocity.mini.Quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentLogin {
	public void registration() throws SQLException
	{
		 StudentDetails sd1=new StudentDetails();
		   System.out.println("first time registration");
		   sd1.getStudentDetail();//taking values for name ,mail and password from student 
		   sd1.inputstDetails1();//storing these values to table database
	}
  public void login() throws SQLException
  {
	  System.out.println("for login");  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter emailid");
	  String loginemailid=sc.next();
	  System.out.println("Enter password");
	  String loginpass=sc.next();
	  
	ConnectionTest  ct=new ConnectionTest ();
	Connection con=  ct.getconnection();
	try {
                   PreparedStatement ps=	con.prepareStatement("select stemailid,passward from studentdetails");
                   ResultSet rs= ps.executeQuery();
                   int count=0;
                   while(rs.next())
                   {    
                	     if(loginemailid.equalsIgnoreCase(rs.getString(1)) && loginpass.equalsIgnoreCase(rs.getString(2)))
                	      {  
                  		     count ++;
                		      break;
                	      }
                	  
                	 
                   }
                   if(count>0  )
                   {
                	 System.out.println("login successfully");  
                	Main mn=new Main();
                	mn.questionset();
                   }
                   else
                   {
                	   System.out.println("unsuccefully");
                	  StudentLogin stl=new StudentLogin();
                	   stl.login();
                   }
                                    
 }catch(Exception e)
	{
	 System.out.println(e);
}
}
}