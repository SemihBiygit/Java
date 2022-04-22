package com.bilgeadam.boost.java.lesson010;

import java.util.Scanner;

public class RegisterLogin {

	public static void main(String[] args) {
		String userName="";
		String password="";
		do {
			System.out.println("1-Sign Up\n"+"2-Login");
			Scanner scan = new Scanner(System.in);
			int key = scan.nextInt();
			
			switch (key) {
			case 1:
				Scanner input = new Scanner(System.in);
				System.out.println("Welcome SignUp Page. Enter your username:");
				userName = input.next();
				System.out.println("Enter your password:");
				password = input.next();
				System.out.println("Your account has been created.");
				break;
			
			case 2:
				Scanner scanner = new Scanner(System.in);
				System.out.println("Please enter your username:");
				String userNameEntry = scanner.nextLine();
				System.out.println("Please enter your password:");
				String passwordEntry = scanner.nextLine();
				
				if(userNameEntry.equals(userName) && passwordEntry.equals(password)) {
					System.out.println("Welcome..");
				}else {
					System.out.println("Wrong id or psw");
				}
				
			default:
				break;
			}
		}while (true);
				
	}

}
