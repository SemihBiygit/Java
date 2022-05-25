package com.bilgeadam.boost.java.lesson026.example.iostream;

import java.io.Serializable;

public class Dog implements Serializable{

	private static final long serialVersionUID = 6946459433712883343L;
	
	String name;
	String breed;

	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

}
