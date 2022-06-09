package com.bilgeadam.boost.java.lesson033.openclose;
/* 
(S.O.L.I.D. Princibles) 
Single Responsibility Principle (
Open-Closed Principle
Liskov's Substituion Principle
Interface Segregation Principle
Depency Injection Principle
*/
public class PasswordHasher {
	String hashedPassword;

	public String hashPassword(String password, HashingType hashingType) { // wrong usage!!
		if (HashingType.BASE64.equals(hashingType)) {
			hashedPassword = "hashed with Base64";				
		} else if (HashingType.MD5.equals(hashingType)) {
			hashedPassword = "hashed with MD5";
		}
		return hashedPassword;
	}
}
