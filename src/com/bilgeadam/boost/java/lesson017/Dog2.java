package com.bilgeadam.boost.java.lesson017;

public class Dog2 extends Animal2 {
	
	void eating() {
		System.out.println("eating dog food...");
	}

	void bark() {
		System.out.println("hav hav hav");
		
	}
	void work() {
	super.eating();
	bark();
	}
}
