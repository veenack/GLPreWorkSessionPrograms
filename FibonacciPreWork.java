package com.gl;

import java.util.Scanner;

public class FibonacciPreWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the NUmber for which you want to find Fibonacci");
		num1 = scan1.nextInt();
		// 
		// 0 1 1 2 n-1 n-2
		int tot1 = 0;
		int tot2 = 1;
		int tot3 = 0;
		for(int i=0;i < num1;i++)
		{
			if(i <= 1)
			{
				System.out.println(tot3);  // 0 tot1
				tot3 = tot1 + tot2;         //1 
			}
			else if ( i == 2)
			{
				System.out.println(tot3); //1
			}
			else
			{
				tot1 = tot2;  
				tot2 = tot3;
				tot3 = tot1+tot2;
				System.out.println(tot3);
			}
		}
		
		

	}

}
