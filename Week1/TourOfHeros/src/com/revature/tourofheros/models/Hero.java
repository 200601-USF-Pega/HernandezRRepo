package com.revature.tourofheros.models;
import java.util.Arrays;

import com.revature.tourofheros.exceptions.InvalidHealthValueException;

//POJO
public class Hero {
	//attributes or fields
	//private access modifier, encapsulates my data
	//uses camelCase
	private String name;
	private String [] specialMove;
	private int healthLevel;
	private boolean isAlive;
	
	//constructor (overloading, polymorphism at runtime)
	//no args constructor, no arguments
	public Hero() {}
	
	//parameterized with parameters 
	public Hero(String name, String [] specialMove, int healthLevel, boolean isAlive) throws InvalidHealthValueException{
		this(name, specialMove);
		this.setHealthLevel(healthLevel);
		this.isAlive = isAlive;
	}
	public Hero(String name, String [] specialMove2) {
		//calls the parent constructor (constructor not inherited)
		super();
		this.name = name;
		this.specialMove = specialMove2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name){
		//add some validation/logic in processing data per instance
		//check if name is numbers
		if(name.isEmpty()) throw new IllegalArgumentException();
		this.name = name;
	}

	public String [] getSpecialMove() {
		return specialMove;
	}

	public void setSpecialMove(String [] specialMove) {
		this.specialMove = specialMove;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void setHealthLevel(int healthLevel) throws InvalidHealthValueException{
		if (healthLevel < 0) {
			//throw exception
			throw new InvalidHealthValueException();
		} else {
			this.healthLevel = healthLevel;
		}
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	//annotation
	@Override
	public String toString() {
		return "Hero [name = " + name + ", specialMove = " + Arrays.toString(specialMove) + ", healthLevel = " + healthLevel
				+ ", isAlive = " + isAlive + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isAlive ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		if (isAlive != other.isAlive)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
		
	
}
