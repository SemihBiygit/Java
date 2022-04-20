package com.bilgeadam.boost.java.lesson009;

import java.util.Scanner;

public class AgeEvaluation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		scanner.close();
		
		if (age < 18) {
			System.out.println("Kid");
		}
		else if (age >= 18 && age < 30) {
			System.out.println("Young");
		}
		else if (age >= 30 && age < 50) {
			System.out.println("Middle aged");
		}
		else {
			System.out.println("Old");
		}
	}

}
