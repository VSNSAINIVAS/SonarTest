// Package in which custom exception is created.
package com.zeta.cException;

// This class is extending Exception class
public class ZetaBoundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Constructor for the message
	public ZetaBoundsException(String msg){
		super(msg);
	}

}
