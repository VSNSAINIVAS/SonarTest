package com.zeta.password;

import java.util.Scanner;

public class Password {
	public static void main(String[] args){
		String password = "";
		Scanner sc = new Scanner(System.in);
		while(true){
			password = sc.next();
			if(password.contains("\n")) break;
			System.out.println(password);
		}
		sc.close();
	}
}
