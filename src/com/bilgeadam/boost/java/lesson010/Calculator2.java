package com.bilgeadam.boost.java.lesson010;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double first = scanner.nextDouble();
		double second = scanner.nextDouble();
		System.out.println("Enter an operator(+,-,*,/) = ");
		char operator = scanner.next().charAt(0);
		double result = 0;
		scanner.close();
		
		
		switch(operator) {
		case '+' :
			result = first+second;
			break;
		case '-':
			result = first-second;
			break;
		case '*':
			result = first*second;
			break;
		case '/':
			result = first/second;
			break;
		default:
			System.err.println("Error! Operator is not correct!");
		System.exit(0);
		}
	System.out.println(first+" "+operator+" "+second+" = "+result);
	}
	

}
