package com.velocity;

import java.util.Scanner;

public class Addition {

	
	int a;
	int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
         int a1=sc.nextInt();
         System.out.println("Enter the second number");
      int b1=sc.nextInt();
      int result = a1+b1;
      System.out.println("Addition is:-"+result);
      System.out.println("samdhan albatte");
      
	
	}



}
