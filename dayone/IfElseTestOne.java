package com.company.dayone;

import java.util.Scanner;

public class IfElseTestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//if number is odd print weird
		//if numb is even and inclusive
	//@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	int num = scan.nextInt();
	scan.close();
	if(num%2 !=0) {
		System.out.println("weird");
	}else {
		if(num >=2 && num <= 5) {
			System.out.println("Not weird");
		}
		else if (num >= 6 && num <= 20) {
			System.out.println("weird");
		}
		else {
			System.out.println("Not weird");
		}
	}
		
	}

}
