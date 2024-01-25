package com.zeta.conditions;

import java.util.*;

public class Leapyear {

	public static void main(String[] args) {
		// Creating a new Scanner object to take the input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year which need to be checked as leap year or not : ");
		int year = sc.nextInt();
		// Checking if the year is divisible by 4 or not.
		if (year % 4 == 0) {
			// If the year is divisible by 100 and not by 400 then the year is
			// not the leap year
			if (year % 100 == 0 && year % 400 != 0)
				System.out.println("Year is not leap year");
			else
				System.out.println("Year is leap year");
		}
		// If its no the case then yea is leap year.
		else
			System.out.println("Year is not leap year");
		sc.close();
	}

}
