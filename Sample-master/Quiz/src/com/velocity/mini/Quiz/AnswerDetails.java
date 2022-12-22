package com.velocity.mini.Quiz;

import java.util.Scanner;

public class AnswerDetails {
	String a="a";
	String b="b";
	String c="c";
	String d="d";
  String ans;
 static int count=0;
  String scan()
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ans");
    String ans=sc.next();
    return ans;
 }
	QuestionDetails1 qd1=new QuestionDetails1();
	
    void answer1()
	{       qd1.question1();
		 AnswerDetails ad=new AnswerDetails();
		 if(ad.scan().equals(d)) {
				count=count+1;
			}
		 
		 
		 
		 
		 
		 
		 
		 
	}
	void answer2()
	{	qd1.question2();
		 AnswerDetails ad=new AnswerDetails();
		 if(ad.scan().equals(a)) {
				count=count+1;
	}
	}

		 void answer3()
			{       qd1.question3();
				 AnswerDetails ad=new AnswerDetails();
				 if(ad.scan().equals(b)) {
						count=count+1;
					}
			}
			void answer4()
			{		qd1.question4();
				 AnswerDetails ad=new AnswerDetails();
				 if(ad.scan().equals(a)) {
						count=count+1;
			}
			}
				 void answer5()
					{     qd1.question5();  
						 AnswerDetails ad=new AnswerDetails();
						 if(ad.scan().equals(c)) {
								count=count+1;
							}
					}
					void answer6()
					{		qd1.question6();
						 AnswerDetails ad=new AnswerDetails();
						 if(ad.scan().equals(b)) {
								count=count+1;
					}
					}
						 void answer7()
							{     qd1.question7();  
								 AnswerDetails ad=new AnswerDetails();
								 if(ad.scan().equals(d)) {
										count=count+1;
									}
							}
							void answer8()
							{		qd1.question8();
								 AnswerDetails ad=new AnswerDetails();
								 if(ad.scan().equals(d)) {
										count=count+1;
							}
							}
								 void answer9()
									{       qd1.question9();
										 AnswerDetails ad=new AnswerDetails();
										 if(ad.scan().equals(b)) {
												count=count+1;
											}
									}
									void answer10()
									{		qd1.question10();
										 AnswerDetails ad=new AnswerDetails();
										 if(ad.scan().equals(b)) {
												count=count+1;
									}

}
	     void dispScore() {
	    	               System.out.println("Result=>");
		                  System.out.println("total score of exam=>"+count);
		                  
		                }
	     void passwithclass()
	     {
	    	 if(count>=8)
	    	 {
	    		 System.out.println("passed with class A");
	    	 }else if(count==7 || count==6)
	    	 {
	    		 System.out.println("passed with class B");
	    	 }else if(count==5)
	    	 {
	    		 System.out.println("passed with class C");
	    	 }else if(count<5)
	    	 {
	    		 System.out.println("class D:-fail");
	    	 }
	     }
}
