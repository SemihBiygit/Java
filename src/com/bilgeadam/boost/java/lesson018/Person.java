package com.bilgeadam.boost.java.lesson018;

public abstract class Person {
	private String name;
	private boolean isHealty;
	private int age;

	public Person(String name, boolean isHealty, int age) {
		this.name = name;
		this.isHealty = isHealty;
		this.age = age;
	}

	public void healtCheck() {
		if (isHealty == true) {
			System.out.println("The person was checked up. Person is healthy");
		} else {
			System.out.println("The person was examined. Necessary medications were given.");
		}

	}

	public String getName() {
		return this.name;
	}

	public boolean isHealty() {
		return this.isHealty;
	}

	public int getAge() {
		return this.age;
	}
}
