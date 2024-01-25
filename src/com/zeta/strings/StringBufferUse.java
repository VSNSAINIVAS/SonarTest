package com.zeta.strings;

// biz, milt, in, com
public class StringBufferUse {
	public static void main(String[] args){
		StringBuffer t = new StringBuffer(18);
		System.out.println(t.capacity());
		t.trimToSize();
		System.out.println(t.capacity());
	}
}
