package com.zeta.conditions;

public class InputValidation {
	public static void main(String[] args){
		String argument = args[0];
		// Method - 1
		//		if(Integer.parseInt(argument) >= Integer.MIN_VALUE && Integer.parseInt(argument) <= Integer.MAX_VALUE)
		//			System.out.println("Given argument is an integer");
		//		else
		//			System.out.println("Given argument in a string");
		// Making the answer as true initially
		boolean answer = true;
		// Getting the length of the string
		int len = argument.length();
		int i = 0;
		// If the number is negative then as first char will be - then we will proceed further
		if(argument.charAt(i) == '-') i++;
		// Looping through every character
		for( ; i < len ; i++){
			answer = answer && (argument.charAt(i) >= '0' && argument.charAt(i) <= '9');
		}
		if(answer) System.out.println("Given argument is an integer");
		else System.out.println("Given argument is a string");
	}
}
