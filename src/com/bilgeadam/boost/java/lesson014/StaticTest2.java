package com.bilgeadam.boost.java.lesson014;

public class StaticTest2 {

	public static void main(String[] args) {
		
		StaticTest st = new StaticTest(); // statik nesne oluşturup multiply methoduna bu nesne üzerinden ulaştık. çünkü multiply statik değildi
		
		System.out.println(st.multiply(2, 2)); 
		
		StaticTest.add(2, 3); //add methoduna doğrudan ulaştım. çünkü statik.
		
		System.out.println(StaticTest.add(2, 3));
		
	}

}
