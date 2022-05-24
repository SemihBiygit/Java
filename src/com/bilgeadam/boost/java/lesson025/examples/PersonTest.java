package com.bilgeadam.boost.java.lesson025.examples;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person("Semih","Male");
		
		try {
			if (p.gender.equalsIgnoreCase("male")) {
				throw new MyException();
			}else {
				System.out.println("Welcome Man-Free Area");
			}
			
		} catch (MyException e) {
			System.out.println("Caught the exception");
		}
		
		
	}

}
