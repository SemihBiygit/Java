//Program that increases the number you receive from the user by 1
package com.bilgeadam.boost.java.lesson008;

import java.util.Scanner;

public class ArithmeticExamples {
	
	public static void main(String[] args) {
		int x;
		//We use scanner class for given info from user
		Scanner scanner = new Scanner (System.in);
		//We specified the message that the user will see
		System.out.println("Please enter a value:");
		
		
		x = scanner.nextInt();
		System.out.println(++x);
	
	}
}
