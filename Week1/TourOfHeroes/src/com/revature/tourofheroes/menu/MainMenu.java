package com.revature.tourofheroes.menu;
import java.util.Scanner;

import com.revature.tourofheroes.exceptions.InvalidHealthValueException;
import com.revature.tourofheroes.models.Hero;

public class MainMenu {
	public void mainMenu() {
		System.out.println("Welcome to my tour of hereos app");
		System.out.println("What would you like to do?");
		System.out.println("[0] Create a hero?");
		System.out.println("[1] Exit");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		sc.nextLine();
		
		if(option == 0) {
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			System.out.println("Special Moves: ");
			String str = sc.nextLine();
			StringBuilder specialMovesSB = new StringBuilder(100);
			
			String[] specialMoves = str.split(", ");
			Hero newHero;
			try {
				newHero = new Hero(name, specialMoves, 100, true);
				System.out.println(newHero);
			} catch (InvalidHealthValueException e) {
				System.out.println("Invalid Health level");
			} 
		}
	}
}
