package com.bilgeadam.boost.java.lesson009;

import java.util.Scanner;

public class NegativeOrPositive {
	public static void main(String[] args) {
		double x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		x = scanner.nextDouble();
		scanner.close();
		
		if(x<0) {
			System.out.println("Number is negative");
		}
		else if (x==0) {
			System.out.println("Number is zero");
		}
		else {
			System.out.println("Number is positive");
		}
	}
}
