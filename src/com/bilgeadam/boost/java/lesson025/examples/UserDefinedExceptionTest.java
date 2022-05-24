package com.bilgeadam.boost.java.lesson025.examples;

public class UserDefinedExceptionTest {

	public static void main(String[] args) {

		try {
			throw new UserDefinedException("This is user-defined exception");
		} catch (UserDefinedException ude) {
			System.out.println(ude.getMessage());
		}
		
	}

}
