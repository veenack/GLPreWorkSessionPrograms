package com.gl;

import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int fact=1;
		
		System.out.println("Please enter the number to calculate factorial");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of number "+num+" is = "+fact);
		fact=-1;
		fact = factorial(num);
		
		System.out.println("Factorial of number "+num+"  using recursive function is = "+fact);
	}
	
	private static int factorial(int n) {
		if(n==0) return 1;
		else
		return n*factorial(n-1);
	}

}
