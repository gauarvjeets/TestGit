package com.main;

import com.inherit.*;

public class Run {

	public static void main(String[] args) {
		Cat gurlaj = new Cat(4, "Gurlaj");
		
		gurlaj.canWalk();
		gurlaj.printName();
		
		Dog dog = new Dog(4, "Jon");
		System.out.println(dog.getName());
		dog.eat();

	}

}
