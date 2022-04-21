package com.bilgeadam.boost.java.lesson008;

import java.util.Scanner;

public class ArithmeticExamples3 {
	public static void main(String[] args) {
		
		double a,b,c;

		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter a");
		a = scanner.nextInt();
		System.out.println("Please enter b");
		b = scanner.nextInt();
		System.out.println("Please enter c");
		c = scanner.nextInt();
		
		System.out.println("Conclusion = "+a*(b+c));
		scanner.close();
	}
}
