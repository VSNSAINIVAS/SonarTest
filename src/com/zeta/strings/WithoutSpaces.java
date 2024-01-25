// Creating a package for strings
package com.zeta.strings;

//Importing java.util.Scanner for creating Scanner object
import java.util.Scanner;

// Class for generating the string without spaces
public class WithoutSpaces {
	public static void main(String[] args){
		System.out.println("Enter the paragraph");
		Scanner sc = new Scanner(System.in);
		String para = sc.nextLine();
		para = para.replaceAll(" ", "");
		System.out.println("===================================================");
		System.out.println("The paragraph modified without spaces is");
		System.out.println(para);
		System.out.println("===================================================");
		sc.close();
	}
}
