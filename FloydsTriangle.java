package com.gl;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4;
		int num = 1;
		for(int i=1;i<=rows;i++)
		{
			for(int j =1; j <= i;j++)		// i =1
			{								// j  1 <= 1     1
				System.out.print(num + " ");// i = 2
				num++;							// j  2  3
													// i 3
			}	
			System.out.println();     //	j 4 5 6
		}
		System.out.println("-----------------");
		for(int i=1;i<=rows;i++)
		{
			for(int j =1; j <= i;j++)		// i =1
			{								// j  1 <= 1     1
				System.out.print(j + " ");// i = 2
				//num++;							// j  2  3
													// i 3
			}	
			System.out.println();     //	j 4 5 6
		}
	}

}
