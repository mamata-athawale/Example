package com.velocity.mini.Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Questoins {
  public static void main(String[] args) {
 {
		     try { 
		    	 Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Questionset","root","root");
	   PreparedStatement ps1=con1.prepareStatement("select * from question order by rand() limit 10");
	   PreparedStatement ps2=con1.prepareStatement("select *from options");
	   
	   
	   
	   ResultSet rs2=ps2.executeQuery();
	   ResultSet rs1=ps1.executeQuery();
	     while(rs1.next())
	     {
	    	
	    	 System.out.print(rs1.getInt(1)+" ");
	    	
	    	 System.out.println(rs1.getString(2)+" ");
	    	 System.out.println( );
	     }
	     while(rs2.next())
	     {    
	    	 System.out.print(rs2.getInt(1)+" ");
	    	System.out.print(rs2.getString(2)+" ");
	    	  System.out.println(rs2.getString(3));
	     }
	     ps1.close();
	     con1.close();
	     rs1.close();
	     
}catch(Exception e)
		     {
	System.out.println(e);
		     }
 }
  }
}
