package com.bilgeadam.boost.java.lesson024.examples;

public class Person {
	String name;
	String lastname;
	String gender;
	int age;

	public Person(String name, String lastname, String gender, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
	}

	void speak() {
		System.out.println("Hi I am :"+ this.name);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + this.name + ", lastname=" + this.lastname + ", gender=" + this.gender + ", age="
				+ this.age + "]";
	}

}
