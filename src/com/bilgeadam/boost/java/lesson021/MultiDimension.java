package com.bilgeadam.boost.java.lesson021;

import java.util.Arrays;

public class MultiDimension {

	public static void main(String[] args) {

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

		int x = myNumbers[1][2];
		System.out.println(x);

		System.out.println("------------------------");

		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < myNumbers[i].length; j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
		System.out.println(Arrays.deepToString(myNumbers));
	}
}