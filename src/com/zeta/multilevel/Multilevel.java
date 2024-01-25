// Package for multilevel inheritance
package com.zeta.multilevel;

class Mobile{
	Mobile(){
		System.out.println("Functionalities like call, messaging and etc");
	}
	public static void call(){
		// Some call method
	}
	public static void message(){
		// Some message method
	}
}

class Android extends Mobile{
	Android(){
		System.out.println("Some additional functionalities like custom launcher, Back button directly, Navigation gestures");
	}
	public static void Navigation(){
		// Some code for performing navigation
	}
	public static void Launcher(){
		// Some code for launching the themes
	}
}

class Nothing extends Android{
	Nothing(){
		System.out.println("Glyph interface added");
	}
	public static void glyph(){
		// Some code for performing glyph
	}
}

// Class multilevel
public class Multilevel {
	public static void main(String[] args){
		new Mobile();
		System.out.println("Done with Mobile");
		System.out.println("======================================");
		new Android();
		System.out.println("Done with Android");
		System.out.println("======================================");
		new Nothing();
		System.out.println("Done with Nothing");
		System.out.println("======================================");
	}
}
