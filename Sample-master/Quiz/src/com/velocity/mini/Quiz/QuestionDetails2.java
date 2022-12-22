package com.velocity.mini.Quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class QuestionDetails2 {

	
	
public static void main(String[] args) {
	
	QuestionDetails2 qd2=new QuestionDetails2();
	qd2.demo();
	
	
	
}
	
	ConnectionTest ct=new ConnectionTest();
	Connection con=ct.getconnection();
	  
	Scanner sc=new Scanner(System.in);
	  void demo() {
		 
	 try
	 {
		 PreparedStatement ps=con.prepareStatement("select *from question_des where order by rand() limit 1");
		  ResultSet rs=ps.executeQuery();        
           
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1));
			  System.out.println(rs.getString(2));
		  }
	 }catch(Exception e)
	 {
		 System.out.println(e);
	 }
   
}
}
