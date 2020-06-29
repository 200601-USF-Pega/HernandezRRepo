package com.revature.calculator.validation;

public class InputValidation {
	public static boolean validateNum(String num) {
		
		try {
			Integer.parseInt(num);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input.");
			return false;
		}
		return true;
	}
	public static boolean validateOption(String num) {
		
		try {
			Integer.parseInt(num);
		} catch (NumberFormatException e) {
			System.out.println("Invalid option.");
			return false;
		}
		return true;
	}
}
