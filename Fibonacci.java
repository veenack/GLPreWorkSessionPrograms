package com.gl;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter the number for which you want to find the fibonacci");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.print("0 1 1 ");
		int tot1 = 0;
		int tot2 = 1;
		int tot3 = 1;
		
		for(int i=3;i<num;i++) {
			tot1=tot2;
			tot2=tot3;
			tot3=tot1+tot2;
			System.out.print(tot3+" ");
		}

	}

}
