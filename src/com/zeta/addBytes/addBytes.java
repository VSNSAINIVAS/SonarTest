package com.zeta.addBytes;
// Importing user defined exception
import com.zeta.cException.*;
import com.zeta.helper.*;

public class addBytes {
	// Function which add two bytes
	public static byte addTwo(byte a, byte b) throws ZetaBoundsException{
		int sum = a + b;
		if(sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE){
			throw new ZetaBoundsException("Oops! These cannot be added out of bounds"); 
		}
		return (byte)sum;
	}
	
	public static void main(String[] args) {
		byte a = 124;
		byte b = 124;
		// Try catching
		try{
			addTwo(a, b);
		}
		catch(ZetaBoundsException e){
			Helper.getLogger(addBytes.class).error(e);
		}
	}

}
