package com.zeta.conditions;

// Importing Scanner to scan for the input
import java.util.Scanner;

// Class validate which checks the bounds and also checks if the current
// value is multiple or not
class Validate {
	// Check for the bounds of the value
	public static boolean checkBounds(int value) {
		if (value >= 0 && value <= 100000) {
			return true;
		}
		return false;
	}
	// Checks if the number is multiple of 10 till the specified digits
	public static boolean checkMultiple(int value, int till) {
		boolean answer = true;
		int check = till==1?9:99;
		while (value > check) {
			answer = answer && (value % 10 == 0);
			value /= 10;
		}
		return answer;
	}
}

// class to get the value of the integer and also the first k digits depends
// on the requirement
class getValue {
	// Computes the length of the given integer value
	public static int getLength(int value) {
		int len = 0;
		while (value > 0) {
			len++;
			value /= 10;
		}
		return len;
	}
	// Gives the first or first two digits depends on the requirement
	public static int getFirst(int value, int till) {
		int check = till==1?9:99;
		while (value > check) {
			value /= 10;
		}
		return value;
	}

}

// Class for performing the operations
class performing {
	// Function to give the answer for two digits
	public static void twoDigits(int val, String[] singleDigit, String[] doubleDigit, String[] doubleIniti) {
		if (Validate.checkMultiple(val, 1)) {
			System.out.print(doubleDigit[(val / 10) - 1]);
		} else if (val >= 11 && val <= 19) {
			System.out.print(doubleIniti[val - 11]);
		} else {
			System.out.print(doubleDigit[(val / 10) - 1]);
			System.out.print(" ");
			System.out.print(singleDigit[(val % 10) - 1]);
		}
	}

	// Function to give the answer for three digits
	public static void threeDigits(int val, String[] singleDigit, String[] doubleDigit, String[] doubleIniti, boolean starter) {
		if (Validate.checkMultiple(val, 1)) {
			if(!starter) System.out.print("and ");
			System.out.print(singleDigit[(val / 100) - 1]);
			System.out.print(" ");
			System.out.print("Hundred");
		} else {
			System.out.print(singleDigit[(val / 100) - 1]);
			System.out.print(" ");
			System.out.print("Hundred and ");
			if (val % 100 >= 1 && val % 100 <= 9)
				System.out.print(singleDigit[(val % 10) - 1]);
			else
				performing.twoDigits(val - 100 * getValue.getFirst(val, 1), singleDigit, doubleDigit, doubleIniti);
		}
	}
	
	// Function to give then answer for four digits
	public static void fourDigits(int val, String[] singleDigit, String[] doubleDigit, String[] doubleIniti) {
		if (Validate.checkMultiple(val, 1)) {
			System.out.print(singleDigit[(val / 1000) - 1]);
			System.out.print(" ");
			System.out.print("Thousand");
		} else {
			if (val % 100 == 0) {
				System.out.print(singleDigit[(getValue.getFirst(val, 1)) - 1]);
				System.out.print(" Thousand and ");
				performing.threeDigits(val - getValue.getFirst(val, 1)*1000, singleDigit, doubleDigit, doubleIniti, true);
			} else {
				System.out.print(singleDigit[(val / 1000) - 1]);
				System.out.print(" ");
				System.out.print("Thousand ");
				if (val % 1000 >= 1 && val % 1000 <= 9) {
					System.out.print("and ");
					System.out.print(singleDigit[(val % 10) - 1]);
				} else if (val % 1000 >= 10 && val % 1000 <= 99) {
					System.out.print("and ");
					performing.twoDigits(val % 100, singleDigit, doubleDigit, doubleIniti);
				} else
					performing.threeDigits(val - 1000 * getValue.getFirst(val, 1), singleDigit, doubleDigit, doubleIniti, true);
			}
		}
	}
	
	// Function to give then answer for fiveDigits
	public static void fiveDigits(int val, String[] singleDigit, String[] doubleDigit, String[] doubleIniti) {
		if (Validate.checkMultiple(val, 2)) {
			performing.twoDigits(val / 1000, singleDigit, doubleDigit, doubleIniti);
			System.out.print(" Thousand");
		} else {
			performing.twoDigits(getValue.getFirst(val, 2), singleDigit, doubleDigit, doubleIniti);
			System.out.print(" Thousand ");
			if (val % 1000 >= 1 && val % 1000 <= 9) {
				System.out.print("and ");
				System.out.print(singleDigit[(val % 10) - 1]);
			} else if (val % 1000 >= 10 && val % 1000 <= 99) {
				System.out.print("and ");
				performing.twoDigits(val % 100, singleDigit, doubleDigit, doubleIniti);
			} else{
				performing.threeDigits(val % 1000, singleDigit, doubleDigit, doubleIniti, false);
			}

		}
	}
}

// Public class
public class NumberToWord {
	// Main method
	public static void main(String[] args) {
		// String array of singleDigit values
		String[] singleDigit = new String[] { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
				"Ten" };
		// String array of doubleDigit values
		String[] doubleDigit = new String[] { "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
				"Ninety", "Hundred" };
		// String array of values from 11 to 19
		String[] doubleIniti = new String[] { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
				"Seventeen", "Eighteen", "Nineteen" };
		// Creating a new scanner for taking in the input
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number to convert it to word : ");
		int val = sc.nextInt();

		if (!Validate.checkBounds(val)) {
			System.out.println("Please enter a value from 0 to 100000");
			sc.close();
			return;
		}
		
		int len = getValue.getLength(val);

		if (val == 0)
			System.out.println("Zero");

		else if (val == 100000)
			System.out.println("1 Lakh only");

		else if (len == 1) {
			System.out.println(singleDigit[val - 1] + " only");
		}

		else if (len == 2) {
			performing.twoDigits(val, singleDigit, doubleDigit, doubleIniti);
			System.out.println(" only");
		}

		else if (len == 3) {
			performing.threeDigits(val, singleDigit, doubleDigit, doubleIniti, true);
			System.out.println(" only");
		}

		else if (len == 4) {
			performing.fourDigits(val, singleDigit, doubleDigit, doubleIniti);
			System.out.println(" only");
		}

		else if (len == 5) {
			performing.fiveDigits(val, singleDigit, doubleDigit, doubleIniti);
			System.out.println(" only");
		}
		// Closing the scanner
		sc.close();
	}
}
