package com.inherit;

//started
public class Animal {
	int noOfLegs;
	String name;
	String typeOfAnimal;
	
	
	
	public Animal(int noOfLegs, String name, String typeOfAnimal){
		this.noOfLegs = noOfLegs;
		this.name = name;
		this.typeOfAnimal = typeOfAnimal;
		
	}
	
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public String getName() {
		return name;
	}
	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}
	
	public void printName(){
		System.out.println(typeOfAnimal + " name is: " + name);
	}
	
}
//ended
