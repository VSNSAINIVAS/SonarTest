// Creating a package for strings
package com.zeta.strings;

// Importing java.util.Scanner for creating Scanner object
import java.util.Scanner;

// Class for alternating the letters
public class AlternateLettersCapital {
	// Main method for performing the function
	public static void main(String[] args) {
		// Declaring the empty string which will be used to add characters
		String str = "";
		int length = 0;
		// Creating the scanner object
		Scanner sc = new Scanner(System.in);
		String answer = "";
		// Adding all the characters
		while (true) {
			System.out.printf("Enter %d character or - to exit : ", length + 1);
			// Getting the character
			char ch;
			ch = sc.next().charAt(0);
			if (ch == '-')
				break;
			str += ch;
			length += 1;
		}
		// Changing the alternate characters
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				answer += (char) (str.charAt(i) - 'a' + 'A');
			} else
				answer += str.charAt(i);
		}
		// Closing the scanner
		sc.close();
		System.out.println("=============================================");
		System.out.print("The final modified string is " + answer);
		System.out.println("\n=============================================");
	}

}
