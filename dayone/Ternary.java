package com.company.dayone;

import java.util.Scanner;

public class Ternary {
	
	public static void main (String [] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		 
		 
		int num1;
		int num2 = 0;
		int num3;
	
		System.out.println("enter first number: ");
		num1 = scan.nextInt();
		
		System.out.println("enter second number: ");
		num2 = scan.nextInt();
		
		System.out.println("enter third number: ");
		num3 = scan.nextInt();
		
		scan.close();

		int tem = (num1 >num2) ? num1: num2;
		
		 int result = (num3 > tem) ? num3 : tem;
		
		System.out.println("Largest value is " + result);
	
	
		
	}
	
	
}
	
	
	
