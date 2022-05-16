package com.bilgeadam.boost.java.lesson021;

import java.util.Arrays;

public class ArrayConcate {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		// Example 1 : Concatenate two arrays using arraycopy

		int aLen = array1.length;
		int bLen = array2.length;
		int[] result = new int[aLen + bLen];

		System.arraycopy(array1, 0, result, 0, aLen);
		System.arraycopy(array2, 0, result, aLen, bLen);
		System.out.println(Arrays.toString(result));

		// Example 2 : Concatenate two arrays without using arraycopy
		int lenght = array1.length + array2.length;
		int[] result2 = new int[lenght];
		int pos = 0;

		for (int element : array1) {
			result2[pos] = element;
			pos++;
		}
		for (int element : array2) {
			result2[pos] = element;
			pos++;
		}

		System.out.println(Arrays.toString(result2));
	}

}
