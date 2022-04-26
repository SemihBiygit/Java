package com.bilgeadam.boost.java.lesson012;

public class FibonacciCalculation {

	public static void main(String[] args) {
		int number = 9;
		long start = System.nanoTime();
		double fib = calculateClassicalFibonacci(number);
		long stop = System.nanoTime();
		System.out.println("Fibonacci of " + number + " = " + fib + " 's "+ (stop-start)+ " nanoseconds");
	}

	private static double calculateClassicalFibonacci(int number) {
		long n1 = 0;
		long n2 = 1;
		long nth = 0;
		
		for (int i = 1; i < number; ++i) {
			nth = n1 + n2;
			n1 = n2;
			n2 = nth;
		}
		return nth;
	}
}
