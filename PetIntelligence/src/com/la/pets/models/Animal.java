package com.la.pets.models;

public class Animal implements Pet {
	
	private String name = "";
	private String breed = "";
	private int weight = 0;
	
	public Animal() {;}
	public Animal(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String showAffection() { 
		return "I love Master!";
	}

}
