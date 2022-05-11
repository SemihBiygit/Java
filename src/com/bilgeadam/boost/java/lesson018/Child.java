package com.bilgeadam.boost.java.lesson018;

public class Child extends Person {

	public Child(String name, boolean isHealty, int age) {
		super(name, isHealty, age);
	}

	public void isVaccinated() {
		System.out.println("Measles vaccination is done");
	}

	@Override
	public void healtCheck() {
		if (isHealty() == true) {
			System.out.println("The child was checked up. Child is healthy");
		} else {
			isVaccinated();
			System.out.println("The child was examined. Necessary medications were given.");
		}
	}

}
