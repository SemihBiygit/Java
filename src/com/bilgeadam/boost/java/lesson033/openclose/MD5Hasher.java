package com.bilgeadam.boost.java.lesson033.openclose;

public class MD5Hasher implements PasswordHasherInterface {

	@Override
	public String hashPassword(String password) {
		return "Hashed with MD5";
	}

}
