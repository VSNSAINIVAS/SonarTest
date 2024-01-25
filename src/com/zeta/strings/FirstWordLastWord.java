// package for strings
package com.zeta.strings;

import java.util.Scanner;

// Class for performing the required operations
public class FirstWordLastWord {
	// Main method
	public static void main(String[] args) {
		// Inputting two strings and then finding the comb of first word first 
		// and last char and also last words first and second char
		char chA1 = '-', chA2 = '-', chB1 = '-', chB2 = '-';
		// Creating a scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the characters of first string line by line");
		while(true){
			char ch;
			System.out.print("Enter any character or - to stop : ");
			ch = sc.next().charAt(0);
			if(ch == '-') break;
			if(chA1 == '-') chA1 = ch;
			chA2 = ch;
		}
		System.out.println("==================================================");
		System.out.println("Enter the characters of second string line by line");
		while(true){
			char ch;
			System.out.print("Enter any character or - to stop : ");
			ch = sc.next().charAt(0);
			if(ch == '-') break;
			if(chB1 == '-') chB1 = ch;
			else if(chB2 =='-') chB2 = ch;
		}
		
		if(chA1 == '-' || chA2 == '-' || chB1 == '-' || chB2 == '-'){
			System.out.println("Oops! Given string cannot be processed to find the output.");
		}
		
		else{
			String res = "";
			res += chA1 + "" + chA2 + "" + chB1 + "" + chB2;
			System.out.println("The final modified string is " + res);
		}
		
		sc.close();
	}

}
