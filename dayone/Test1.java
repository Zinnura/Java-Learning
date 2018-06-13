package com.company.dayone;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the your age");
	num = scan.nextInt();
	scan.close();
	
	if(num  <30) {
		System.out.println("You are young");
	}else {
		System.out.println("You are old");
	}
	}

}
