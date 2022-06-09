package com.bilgeadam.boost.java.lesson033.singleresponsibility;
/* 
		(S.O.L.I.D. Princibles) 
	Single Responsibility Principle (
	Open-Closed Principle
	Liskov's Substituion Principle
	Interface Segregation Principle
	Depency Injection Principle
 */

public class PasswordHasher {


	public void hashPassword() { // right usage

		// hashing code
	}

	public void savePassword() { // right usage

		// save to database
	}

	public void hashAndSavePassword() { // wrong usage!!
		hashPassword();
		savePassword();
	}
}
