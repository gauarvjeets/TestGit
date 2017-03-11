package com.inherit;

public class Cat extends Animal {

	public Cat(int noOfLegs, String name) {
		super(noOfLegs, name, "Cat");		
	}
	
	public void canWalk(){
		if(super.getNoOfLegs() == 4){
			System.out.println(super.getTypeOfAnimal() + " Can Walk");
		}
		else{
			System.out.println(super.getTypeOfAnimal() + " cannot walk with me");
		}
	}

}
