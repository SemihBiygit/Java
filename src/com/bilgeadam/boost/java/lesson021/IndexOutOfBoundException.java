package com.bilgeadam.boost.java.lesson021;

public class IndexOutOfBoundException {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40 };

		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
