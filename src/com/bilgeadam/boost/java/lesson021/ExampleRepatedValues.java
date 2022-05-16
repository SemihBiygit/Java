package com.bilgeadam.boost.java.lesson021;

public class ExampleRepatedValues {

	public static void main(String[] args) {

		int[] array = { 3, 7, 12, 43, 54, 43, 28, 3, 19, -24, -19 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[j]);
				}
			}
		}
	}
}