package com.gl;

import java.util.Scanner;

public class StudlyCapsDemo {

	int ascii_a = 'a';
	int ascii_z = 'z';
	
	int ascii_0 = 0;
	int ascii_9 = 9;
	
	char ch_A = 'A';
	char ch_Z = 'Z';
	
	int ascii_A = (int) ch_A;
	int ascii_Z = (int) ch_Z;
	
	
	
	StudlyCapsDemo(){
		System.out.println("ascii value of A to Z "+ ascii_A +" "+ ascii_Z);
		System.out.println("ascii value of a to z "+ ascii_a + " "+ascii_z);
		System.out.println("ascii value of 0 to 9 "+ ascii_0 + " "+ascii_9);
	}
	
	public void ConvertTextToStudlyCpas() {
		String text,convertedText ="";
		int ascii;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text. You can includes text and numbers also");
		text = scan.nextLine();
		
		for(int i=0;i<text.length();i++) {
			ascii = text.charAt(i);
			
			if(i%2 != 0) { // Odd --small case, numbers and symbols are left as is
				if(ascii >= 97 && ascii <=122) {
					ascii-=32;
					convertedText += (char)ascii;
				}
				else if(ascii >=65 && ascii <= 90) { // not needed, but condition explains better.. keep as is
					convertedText += (char) ascii;
				}
				else // any other number or symbol
					convertedText += (char) ascii;
			}
			if(i%2 == 0) { // Even -- Capital case and symbols are left as is
				if(ascii >= 65 && ascii <=90) {
					ascii+=32;
					convertedText += (char)ascii;
				}
				else if(ascii >=97 && ascii <= 122) {// not needed, but condition explains better.. keep as is
					convertedText += (char) ascii;
				}
				else // any other number or symbol
					convertedText += (char) ascii;
			}
		}
		
		System.out.println("\n Studle Caps = "+convertedText);
	}
	public static void main(String[] args) {
		
       StudlyCapsDemo studlyCaps = new StudlyCapsDemo();
       studlyCaps.ConvertTextToStudlyCpas();
	}

}
