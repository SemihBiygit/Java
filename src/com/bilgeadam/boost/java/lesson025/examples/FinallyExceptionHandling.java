package com.bilgeadam.boost.java.lesson025.examples;

public class FinallyExceptionHandling {

	public static void main(String[] args) {

		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println("Hata yakalandi");
		} finally {
			System.out.println("Finally block is always executed.");
		}

	}

}
