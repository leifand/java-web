package com.la.pets.models;

public class Dog extends Animal {
	
	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		return "WOOF!";
	}

}
