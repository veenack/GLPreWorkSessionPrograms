package com.gl;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		System.out.println("Enter the number to print table");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		//int i=1;
		for(int i=1;i<=10;i++) 
		  System.out.println(num+"*"+i+" = "+num*i);
		

	}

}
