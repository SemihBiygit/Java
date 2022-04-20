//Program that gives the quotient and the remainder of the 2 entered numbers
package com.bilgeadam.boost.java.lesson008;

import java.util.Scanner;

public class ArithmeticExamples2 {
 
	public static void main(String[] args) {
	
		double x,y;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter 2 numbers");
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println("div = " + (x/y));
		System.out.println("mod = " + (x%y));
		
		
}
}
