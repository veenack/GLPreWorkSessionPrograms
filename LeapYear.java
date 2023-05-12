package com.gl;

import java.util.Scanner;

public class LeapYear {

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("-----------Enter number to find LeapYear-----");
//		int num = scan.nextInt();
//		
//		if(num%400 == 0)
//			System.out.println("LEAP YEAR");
//		else if(num%4 ==0 && num%100 !=0)
//			System.out.println("LEAP YEAR");
//		else
//			System.out.println("NOT A LEAP YEAR");
//
//	}

	public static void main(String[] args) {
		int year = 1300;
		// leap year is perfectly divisible by 400
		if (year % 400 == 0) {
			System.out.println(" Leap Year");
		}
		// not a leap year if divisible by 100 and not divisible by 400
		else if (year % 100 == 0) {
			System.out.println(" not a leap year");
		}
		// leap year if divisible by 4 and not divisible by 100
		else if (year % 4 == 0) {
			System.out.println("leap year");
		}
		// rest all years are non leap years
		else {
			System.out.println("not a leap year");
		}
	}

}
