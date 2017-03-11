package com.inherit;

public class Monkey extends Animal {

	public Monkey(int noOfLegs, String name, String typeOfAnimal) {
		super(noOfLegs, name, typeOfAnimal);
		
	}
	public void canJump(){
		if (super.getNoOfLegs() == 6){
			System.out.println(super.getTypeOfAnimal()  +  "Can Walk");
		 
		}
		
		else {
			System.out.println(super.getTypeOfAnimal()    +  "Cannot Walk");
		}
		
		
	}
	
	
	
	

}
