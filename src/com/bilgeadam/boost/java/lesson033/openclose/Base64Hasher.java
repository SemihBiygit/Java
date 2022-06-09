package com.bilgeadam.boost.java.lesson033.openclose;

public class Base64Hasher implements PasswordHasherInterface {

	@Override
	public String hashPassword(String password) {
		return "Hashed with Base64";
	}

}
