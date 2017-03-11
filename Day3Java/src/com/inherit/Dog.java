package com.inherit;

public class Dog extends Animal {
	public Dog(int noOfLegs, String name) {
		super(noOfLegs, name, "DOG");
	}
     public  void eat() {
    	 System.out.println("Animal.eat() called");
    	 
     }	 
     public void move(int speed){
    	 System.out.println("Animal is moving  at "  + speed);
    	 
     }
 }
