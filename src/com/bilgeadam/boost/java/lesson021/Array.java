package com.bilgeadam.boost.java.lesson021;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		double[] data; // declare an array

		data = new double[10]; // allocate memory

		double[] data2 = new double[8];

		int[] age = { 12, 4, 5, 25, 7 }; // declare and initialize array

		int[] age2 = new int[5];// declare array
		age2[0] = 12;
		age2[1] = 4;
		age2[2] = 5; // intilalize array
		age2[3] = 25;
		age2[4] = 7;

		System.out.println("First element: " + age[0]);
		System.out.println("Second element: " + age[1]);
		System.out.println("Third element: " + age[2]); // access each array elements
		System.out.println("Fourth element: " + age[3]);
		System.out.println("Fifth element: " + age[4]);

		System.out.println("----------------------------");

		// loop through the array, using for loop
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}

		System.out.println("----------------------------");

		// using foreach loop
		for (int i : age) {
			System.out.println(i);
		}

		System.out.println("----------------------------");
		
		// array.toString
		String temp = Arrays.toString(age);
		System.out.println(temp);
		

	}

}
