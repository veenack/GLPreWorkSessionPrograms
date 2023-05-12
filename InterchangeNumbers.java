package com.gl;

import java.util.Scanner;

public class InterchangeNumbers {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			System.out.println("-----------Enter two numbers-----");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			System.out.println("-----------num1 and num2 before swapping is"+num1+" and "+num2);
			
			num1 = num1+num2;
			num2 =num1-num2;
			
			num1 = num1-num2;
			
			System.out.println("-----------num1 and num2 after swapping is "+num1+" and "+num2);
		}
		catch(Exception e) {
			
		System.out.println(e.getMessage());
		}

	}

}
