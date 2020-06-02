package com.revature.tourofheroes.service;

import com.revature.tourofheroes.exceptions.InvalidHealthValueException;
import com.revature.tourofheroes.models.Hero;

public class HeroService {
	public boolean createHero() {
		String[] specialMoves = {"heat vision", "light", "invulnerability"};
		
		Hero newHero;
		//order matters in catch blocks
		try {
			newHero = new Hero("Superman", specialMoves, -1, false);
		} catch (InvalidHealthValueException e){
			e.printStackTrace();
			return false;
		} finally {
			//finally runs always
			//usually where clean up goes (file, connection close etc.) 
			System.out.println("Tried to make a hero could've failed");
		}
		
		//try with resources - to read on
		
		System.out.println(newHero);
		return true;
	}
}
