package com.velocity.mini.Quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDetails {
  String stname;
  String stemailid;
  String pass;
ConnectionTest  ct=new ConnectionTest ();
void getStudentDetail() throws SQLException
{
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter student name");
	   this.stname=sc.nextLine();
	   System.out.println("Enter student emailid");
	   this.stemailid=sc.next();
	   System.out.println("Enter passward");
	   this.pass=sc.next();
	
}
void inputstDetails() throws SQLException
{    
	
	  Connection con= ct.getconnection();
	  PreparedStatement ps=con.prepareStatement
     ("insert into Studentdetails(stname,stemailid,score,passward)values(?,?,?,?)");
	  
	  StudentDetails sd=new StudentDetails();
	  AnswerDetails ad=new AnswerDetails();
	  int count=ad.count;
	    ps.setString(1,stname);
	    ps.setString(2,stemailid);
	 
	    ps.setInt(3,ad.count);
	    ps.setString(4, pass);
      int i=ps.executeUpdate();
     //System.out.println (ad.count);
     
}

  void displaystudentdetails() throws SQLException
{   
	       System.out.println("List of Student details:-");
	       Connection con= ct.getconnection();
	       Statement st=con.createStatement();
	      ResultSet rs= st.executeQuery("select *from Studentdetails order by score desc");
	   //   ResultSet rs1=st.executeQuery("select question_no from question order by rand()");
	      while(rs.next())
	    {
	    	System.out.print(rs.getInt(1)+".");
	    	System.out.print(rs.getString(2)+"(");
	    	System.out.print(rs.getString(3)+")=>");
	    	System.out.println(rs.getInt(4));
	    }
	    
	    
}

  void inputstDetails1() throws SQLException
  {    
  	
  	  Connection con= ct.getconnection();
  	  PreparedStatement ps=con.prepareStatement
       ("insert into Studentdetails(stname,stemailid,passward)values(?,?,?)");
  	  
  	  StudentDetails sd=new StudentDetails();
  	  AnswerDetails ad=new AnswerDetails();
  	  int count=ad.count;
  	  ps.setString(1,stname);
  	  ps.setString(2,stemailid);
  	 
  	//  ps.setInt(3,ad.count);
  	  ps.setString(3, pass);
        int i=ps.executeUpdate();
       //System.out.println (ad.count);
       
  }
  
  
  
}
	 


