package com.bilgeadam.boost.java.lesson010;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		long factor;
		
		while (true) {
			System.out.print("Please enter a number between 1-23. (99 -> end of program)");
			input = scanner.nextInt();
			System.out.println();
			if (input==99) {
				System.out.println("Thanks for using program");
				break;
			}
			if (input < 1 || input > 23) {
				System.err.println("Number should be between 1-23");
				continue;
			}
			factor = 1;
			for (int i=1; i<=input; i++) {
				factor *= i;
			}
			System.out.println("Factorial of " +input + " is = " + factor);
		}
		
		scanner.close();
		System.out.println("Bye Bye");
		
		
		
		
	}

}
