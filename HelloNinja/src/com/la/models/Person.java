package com.la.models;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name = "Unknown";
    private int age = -1;
    
    public Person(){
    }
    
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String greeting(){
        return "Hello! My name is " + name + ". and I am " + age + " years old.";
    }

}
