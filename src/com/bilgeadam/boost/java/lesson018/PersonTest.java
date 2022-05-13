package com.bilgeadam.boost.java.lesson018;

public class PersonTest {

	public static void main(String[] args) {
		Person c = new Child("Alp", false, 5);
		Person a = new Adult("Semih",false,25);
		c.healtCheck();
		a.healtCheck();
		
	}

}
