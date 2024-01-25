package com.zeta.conditions;

//import java.util.Scanner;

public class Validation {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		String a = "zeta";
		switch (a) {
		case "zeta":
			System.out.println("Within the range of 100");
			return;
		case "srinivas":
			System.out.println("Within the range of 1000");
			break;
		default:
			System.out.println("Out of range");
			break;
		}
	}
}
