package com.revature.tourofheroes.exceptions;

public class InvalidHealthValueException extends Exception {
	
	
	private static final long serialVersionUID = -3302351326146231865L;
	public InvalidHealthValueException() {
		super("Health level should not be negative!");
	}
	public InvalidHealthValueException(String message) {
		super(message);
	}
}
