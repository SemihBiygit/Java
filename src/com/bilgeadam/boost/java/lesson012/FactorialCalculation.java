package com.bilgeadam.boost.java.lesson012;

public class FactorialCalculation {

	public static void main(String[] args) {
		int number = 5;
		long start1 = System.nanoTime();
		double fact = calculateClassicalFactorial(number);
		long stop1 = System.nanoTime();
		System.out.println("Factorial of " + number + " = " + fact + "'s"+ (stop1-start1)+ "nanoseconds");

		start1 = System.nanoTime();
		fact = calculateRecursiveFactorial(number);
		stop1 = System.nanoTime();
		System.out.println("Factorial of " + number + " = " + fact + "'s"+ (stop1-start1)+ "nanoseconds");
		
	}

	private static double calculateClassicalFactorial(int number) {
		double fact = 1;
		
		if(number == 0 || number == 1) {
			return fact;
		}else {
			for(int i = 1; i<= number; i++) {
				fact *= i;
			}
		}	
		return fact;
	}
	private static double calculateRecursiveFactorial(int number) {
		if (number == 0 || number == 1) { //exit from recursive function
			return 1;
		}
		else {
			return number * calculateRecursiveFactorial(number-1);
		}
	}
	
}
