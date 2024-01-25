package com.zeta.util;

import java.util.Vector;

public class Vec {
	public static void main(String[] args){
		Vector v = new Vector();
		Vector v1 = new Vector();
		v1.add("Nivas");
		v1.add(null);
		v1.add("Aditya");
		v.add("Nivas");
		boolean b = v1.retainAll(v);
		System.out.println(b);
	}
}
