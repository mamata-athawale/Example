package com.velocity.mini.Quiz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class QuestionDetails1 implements QuestionDetails {
ConnectionTest ct=new ConnectionTest();
Connection con=ct.getconnection();
  
Scanner sc=new Scanner(System.in);

	public void question1()  {
	     try { 
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select *from question where question_no=1");        
   // ResultSet rs=st.executeQuery("select *from option order by rand() limit 1");
     while(rs.next())
     { 
    	 System.out.print(" Q"+rs.getInt(1)+":- " );
    	 System.out.println(rs.getString(2));
    	 
     }
     
     ResultSet rs1=st.executeQuery("select *from options where question_no=1");
 System.out.println("options:-");
     while(rs1.next())
     {   
    	 System.out.print( rs1.getString(2)+") ");
    	 System.out.println(rs1.getString(3)+" ");
    	 
     }  
     }catch(Exception e)
     {
    	 System.out.println(e);
     }
	}
	
	
	public void question2() {
	     try { 
	     Statement st=con.createStatement();
	     ResultSet rs=st.executeQuery("select *from question where question_no=2");
	     
	     while(rs.next())
	     {
	    	 System.out.print(" Q"+rs.getInt(1)+":- " );
	    	 System.out.println(rs.getString(2));
	    	 
	     }
	     ResultSet rs1=st.executeQuery("select *from options where question_no=2");
	 System.out.println("options:-");
	     while(rs1.next())
	     {
	    	 System.out.print( rs1.getString(2)+") ");
	    	 System.out.println(rs1.getString(3)+" ");
	    	 
	     }
	     
	   
	     }catch(Exception e)
	     {
	    	 System.out.println(e);
	     }
	}


	public void question3() {
	     try { 
	     Statement st=con.createStatement();
	     ResultSet rs=st.executeQuery("select *from question where question_no=3");
	     
	     while(rs.next())
	     {
	    	 System.out.print(" Q"+rs.getInt(1)+":- " );
	    	 System.out.println(rs.getString(2));
	    	 
	     }
	     ResultSet rs1=st.executeQuery("select *from options where question_no=3");
	 System.out.println("options:-");
	     while(rs1.next())
	     {
	    	 System.out.print( rs1.getString(2)+") ");
	    	 System.out.println(rs1.getString(3)+" ");
	    	 
	     }
	     
	   
	     }catch(Exception e)
	     {
	    	 System.out.println(e);
	     }
	
	}


	@Override
	public void question4() {
		 try { 
		     Statement st=con.createStatement();
		     ResultSet rs=st.executeQuery("select *from question where question_no=4");
		     
		     while(rs.next())
		     {
		    	 System.out.print(" Q"+rs.getInt(1)+":- " );
		    	 System.out.println(rs.getString(2));
		    	 
		     }
		     ResultSet rs1=st.executeQuery("select *from options where question_no=4");
		 System.out.println("options:-");
		     while(rs1.next())
		     {
		    	 System.out.print( rs1.getString(2)+") ");
		    	 System.out.println(rs1.getString(3)+" ");
		    	 
		     }
		     
		   
		     }catch(Exception e)
		     {
		    	 System.out.println(e);
		     }
		
	}


	@Override
	public void question5() {
		 try { 
		     Statement st=con.createStatement();
		     ResultSet rs=st.executeQuery("select *from question where question_no=5");
		     
		     while(rs.next())
		     {
		    	 System.out.print(" Q"+rs.getInt(1)+":- " );
		    	 System.out.println(rs.getString(2));
		    	 
		     }
		     ResultSet rs1=st.executeQuery("select *from options where question_no=5");
		 System.out.println("options:-");
		     while(rs1.next())
		     {
		    	 System.out.print( rs1.getString(2)+") ");
		    	 System.out.println(rs1.getString(3)+" ");
		    	 
		     }
		     
		   
		     }catch(Exception e)
		     {
		    	 System.out.println(e);
		     }
	}


	@Override
	public void question6() {
		 try { 
		     Statement st=con.createStatement();
		     ResultSet rs=st.executeQuery("select *from question where question_no=6");
		     
		     while(rs.next())
		     {
		    	 System.out.print(" Q"+rs.getInt(1)+":- " );
		    	 System.out.println(rs.getString(2));
		    	 
		     }
		     ResultSet rs1=st.executeQuery("select *from options where question_no=6");
		 System.out.println("options:-");
		     while(rs1.next())
		     {
		    	 System.out.print( rs1.getString(2)+") ");
		    	 System.out.println(rs1.getString(3)+" ");
		    	 
		     }
		     
		   
		     }catch(Exception e)
		     {
		    	 System.out.println(e);
		     }
	}


	@Override
	public void question7() {
		 try { 
		     Statement st=con.createStatement();
		     ResultSet rs=st.executeQuery("select *from question where question_no=7");
		     
		     while(rs.next())
		     {
		    	 System.out.print(" Q"+rs.getInt(1)+":- " );
		    	 System.out.println(rs.getString(2));
		    	 
		     }
		     ResultSet rs1=st.executeQuery("select *from options where question_no=7");
		 System.out.println("options:-");
		     while(rs1.next())
		     {
		    	 System.out.print( rs1.getString(2)+") ");
		    	 System.out.println(rs1.getString(3)+" ");
		    	 
		     }
		     
		   
		     }catch(Exception e)
		     {
		    	 System.out.println(e);
		     }
		
	}


	@Override
	public void question8() {
		 try { 
		     Statement st=con.createStatement();
		     ResultSet rs=st.executeQuery("select *from question where question_no=8");
		     
		     while(rs.next())
		     {
		    	 System.out.print(" Q"+rs.getInt(1)+":- " );
		    	 System.out.println(rs.getString(2));
		    	 
		     }
		     ResultSet rs1=st.executeQuery("select *from options where question_no=8");
		 System.out.println("options:-");
		     while(rs1.next())
		     {
		    	 System.out.print( rs1.getString(2)+") ");
		    	 System.out.println(rs1.getString(3)+" ");
		    	 
		     }
		     
		   
		     }catch(Exception e)
		     {
		    	 System.out.println(e);
		     }
	}


	@Override
	public void question9() {
		 try { 
		     Statement st=con.createStatement();
		     ResultSet rs=st.executeQuery("select *from question where question_no=9");
		     
		     while(rs.next())
		     {
		    	 System.out.print(" Q"+rs.getInt(1)+":- " );
		    	 System.out.println(rs.getString(2));
		    	 
		     }
		     ResultSet rs1=st.executeQuery("select *from options where question_no=10");
		 System.out.println("options:-");
		     while(rs1.next())
		     {
		    	 System.out.print( rs1.getString(2)+") ");
		    	 System.out.println(rs1.getString(3)+" ");
		    	 
		     }
		     
		   
		     }catch(Exception e)
		     {
		    	 System.out.println(e);
		     }
	}


	@Override
	public void question10() {
		 try { 
		     Statement st=con.createStatement();
		     ResultSet rs=st.executeQuery("select *from question where question_no=10");
		     
		     while(rs.next())
		     {
		    	 System.out.print(" Q"+rs.getInt(1)+":- " );
		    	 System.out.println(rs.getString(2));
		    	 
		     }
		     ResultSet rs1=st.executeQuery("select *from options where question_no=10");
		 System.out.println("options:-");
		     while(rs1.next())
		     {
		    	 System.out.print( rs1.getString(2)+") ");
		    	 System.out.println(rs1.getString(3)+" ");
		    	 
		     }
		     
		   
		     }catch(Exception e)
		     {
		    	 System.out.println(e);
		     }
		 
		 
		 
		
	}
}
