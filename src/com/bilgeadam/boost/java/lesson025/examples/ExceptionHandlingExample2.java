package com.bilgeadam.boost.java.lesson025.examples;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {

		try {
			String s = null;
			System.out.println(s.length());			
		} catch (NullPointerException e) {
			System.out.println("Null Point Exception: "+e.getMessage());
		}finally {
			System.out.println("syout bisiler");
		}
		
	}

}
