package com.bilgeadam.boost.java.lesson025.examples;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {

		try {
			int divideByZero = 5 / 0;
		} catch (ArithmeticException e) {
			System.err.println("Arithmetic Exception : "+e.getMessage());
		} finally {
			System.out.println("Final Block.");
		}

	}

}