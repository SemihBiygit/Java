package com.bilgeadam.boost.java.lesson025.examples;

public class ThrowExample {

	public static void validate(int age) {
		if (age<18) {
			throw new ArithmeticException("Person is not eligible to enter casino.");
		}else {
			System.out.println("Welcome to casino.");
		}
	}
	
	public static void main(String[] args) {

		validate(18);
		
	}

}
