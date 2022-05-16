package com.bilgeadam.boost.java.lesson021;

public class ExampleSum {

	public static void main(String[] args) {
		int[] array1 = {2,-9,0,5,12,-25,22,9,8,12};
		int sum = 0;
		
		for (int i : array1) {
			sum = sum+i;
		}
		double average = (double)sum /(double) array1.length;
		System.out.println(sum);
		System.out.println(average);
	}

}
