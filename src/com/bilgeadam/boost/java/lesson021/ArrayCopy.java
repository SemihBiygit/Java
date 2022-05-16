package com.bilgeadam.boost.java.lesson021;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		// 1- copying arrays

		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] positiveNumbers = numbers;

		for (int number : positiveNumbers) {
			System.out.print(number + ", ");
		}

		// 2- using looping construct to copy arrays
		int[] source = { 1, 2, 3, 4, 5, 6 };
		int destination[] = new int[source.length];

		// iterate and copy elements from source to destination
		for (int i = 0; i < source.length; i++) {
			destination[i] = source[i];
		}

		System.out.println("----------------------------");

		// 3- copying arrays using arraycopy() method ( arraycopy(Object source, int
		// sourcePosition, Object destination, int destionationPosition, int lenght) )
		int[] n1 = { 2, 3, 4, 12, 12, -1 };
		int[] n3 = new int [5];
		int[] n2 = new int[n1.length];
		
		System.arraycopy(n1, 0, n2, 0, n1.length);
		System.out.println(Arrays.toString(n2));
		
		System.arraycopy(n1, 2, n3, 1, 2);
		System.out.println(Arrays.toString(n3));

	}

}
