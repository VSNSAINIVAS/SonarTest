package com.zeta.strings;

import java.util.Scanner;

public class ValidateEmail {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email which need to be validated : ");
		StringBuffer str = new StringBuffer();
		String s;
		s = sc.next();
		if(s.length() > 18){
			System.out.println("Enter the string of length less than 18");
		}
		else{
			str.append(s);
			int count = 0;
			int capacity = s.length();
			int indexOf = 0;
			for(int i = 0 ; i < capacity ; i++){
				if(str.charAt(i) == '@'){
					count += 1;
					indexOf = i;
				}
			}
			if(count > 1 || count == 0 || indexOf == capacity - 1 || str.charAt(indexOf + 1) == '.'){
				System.err.println("Invalid email");
				sc.close();
				return;
			}
			else{
				int i = indexOf;
				for(; i < capacity ; i++){
					if(str.charAt(i) == '.') break;
				}
				String curr = str.substring(i + 1, capacity);
				if(curr.equals("in") || curr.equals("com") || curr.equals("milt") || curr.equals("biz")){
					System.out.println("Valid email!!");
					sc.close();
					return;
				}
				System.err.println("Invalid email");
			}
		}
		sc.close();
	}
}
 