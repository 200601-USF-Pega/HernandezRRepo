package com.revature.calculator.menu;

import java.util.Scanner;

import com.revature.calculator.model.Calculator;
import com.revature.calculator.validation.InputValidation;

public class MainMenu {
	public void menu() {
		Calculator calc = new Calculator();
		int a=0;
		int b=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two digits: ");
		String input = in.nextLine();
		if(InputValidation.validateNum(input))
			a = Integer.parseInt(input);
		else
			menu();
		input = in.nextLine();
		if(InputValidation.validateNum(input))
			b = Integer.parseInt(input);
		else 
			menu();
		
		System.out.println("Choose an operation");
		System.out.println("[1] Multiply\n[2] Divide\n[3] Add\n[4] Subtract");
		
		String option = in.nextLine();
		if(InputValidation.validateOption(option)) 
			switch (Integer.parseInt(option)) {
				case 1: System.out.println(calc.multiply(a, b));
					      break;
				case 2: System.out.println(calc.divide(a, b));
						  break;
				case 3: System.out.println(calc.add(a, b));
				          break;
				case 4: System.out.println(calc.subtract(a, b));
				  		  break;
			}
		else
			menu();
		
	}
}
