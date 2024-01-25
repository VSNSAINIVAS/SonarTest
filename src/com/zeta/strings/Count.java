// Creating a package for strings
package com.zeta.strings;
import java.util.Scanner;

// Class count to count for the characters
public class Count {
	// Method count for performing the count
	public static int count(String para, char ch, boolean sentinal){
		int len = para.length();
		int ans = 0;
		for(int i = 0 ; i < len ; i++){
			// Checking if the current character is equal to the specified character based on the case sensitivity
			if(sentinal){
				// Getting the values based on ascii number
				int val1 = para.charAt(i)>=97?para.charAt(i)-'a':para.charAt(i)-'A';
				int val2 = ch>=97?ch-'a':ch-'A';
				if(val1 == val2) ans += 1;
			}
			else{
				// Else comparing the characters case sensitively
				if(para.charAt(i) == ch) ans += 1;
			}
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the paragraph for perfomring the count operation");
		String str = sc.nextLine();
		while(true){
			System.out.print("Enter any character to be counted in para or - to exit : ");
			char ch = sc.next().charAt(0);
			if(ch == '-') break;
			System.out.print("Enter 1 to count case-insensitive or any other for case-sensitive : ");
			int sent = sc.nextInt();
			boolean value = false;
			if(sent == 1) value = true;
			System.out.println("===================================================================================");
			System.out.printf("The number of characters in the sentence (%c) is %d\n",ch,Count.count(str, ch, value));
			System.out.println("===================================================================================");
		}
		System.out.println("===================================================================================");
		System.out.println("No of characters in the paragraph : " + str.length());
		sc.close();
	}
}
