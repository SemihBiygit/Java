package com.bilgeadam.boost.java.lesson013;

public class PasswordTest {

	public static void main(String[] args) {
		Password password = new Password();
		
		if (password.assign("", "qwerty")) {
			System.out.println("New password has been created.");
			
		}else {
			System.err.println("There was an error creating the password.");
		}
		if (password.assign("qwerty", "semih")) {
			System.out.println("New password has been created.");
		}else {
			System.err.println("There was an error creating the password.");
		}
		
		
	}

}
