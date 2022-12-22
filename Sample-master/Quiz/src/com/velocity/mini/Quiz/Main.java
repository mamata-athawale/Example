package com.velocity.mini.Quiz;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public void questionset() throws SQLException {
		{
	
		   AnswerDetails ad=new AnswerDetails();
            StudentDetails sd1=new StudentDetails();
		    
		    System.out.println("===========================================================");
            ad.answer1();
   
           System.out.println("========================================================================");
   	       ad.answer2();
	      
	       System.out.println("========================================================================");	      
	       ad.answer3();
	      
	       System.out.println("====================================================================");
	     
           ad.answer4();
   
           System.out.println("========================================================================");
   
           ad.answer5();
   
           System.out.println("========================================================================");
     
           ad.answer6();
   
           System.out.println("========================================================================");
    
           ad.answer7();
   
           System.out.println("========================================================================");
                    
       
           ad.answer8();
   
           System.out.println("========================================================================");
           
           ad.answer9();
   
           System.out.println("========================================================================");
          
           ad.answer10();
   
           System.out.println("========================================================================");
               
           sd1.inputstDetails();
	       ad.dispScore();
	       ad.passwithclass();
	       System.out.println("==========================================================");
	       sd1.displaystudentdetails();
	      
			
	}
	
	}
	
}
