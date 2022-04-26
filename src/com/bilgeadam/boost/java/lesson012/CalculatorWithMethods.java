package com.bilgeadam.boost.java.lesson012;

import java.util.Scanner;

public class CalculatorWithMethods {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the First Operand : ");
	        double a = scanner.nextDouble();        
	    System.out.println("Enter the Operator (+,-,*,/,%) : ");
	        char operator = scanner.next().charAt(0);	        
	    System.out.println("Enter the Second Operand : ");
	        double b = scanner.nextDouble();
	        scanner.close(); 
	        
	        double result = 0;
	        
	        switch(operator){
	        case '+':
	        	result = add(a,b);
	            break;
	        case '-':
	        	result = subtraction(a,b);
	            break;
	        case '*':
	        	result = multiplication(a,b);
	            break;
	        case '/':
	        	result = division(a,b);
	            break ; 
	        case '%':
	        	result = mod(a,b);
	            break ;}
	
	        System.out.println(a+" "+operator+" "+b+" = "+result);
	}
		
		private static double add(double a, double b) {
			return (a + b);
		}
		private static double subtraction(double a, double b) {
			return a - b;
		}
		private static double multiplication(double a, double b) {
			return a * b;
		}	
		private static double division(double a, double b) {
			return a / b;
		}
		private static double mod(double a, double b) {
			return a % b;
		}	
}
