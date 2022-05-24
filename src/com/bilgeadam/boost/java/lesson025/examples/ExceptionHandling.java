package com.bilgeadam.boost.java.lesson025.examples;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			// Hataya sebep olabilecek herhangi bir kod.
			int myInt = Integer.parseInt("Semih");
			System.out.println(myInt);
			return;
		} catch (NumberFormatException nfe) {
			// Hata durumunda çalışmasını istediğimiz kod.
			System.err.println("Stop trying convert a text to a number!!");
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} finally {
			System.out.println("Finally block.");
		}

	}

}