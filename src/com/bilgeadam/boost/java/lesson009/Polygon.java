package com.bilgeadam.boost.java.lesson009;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		int n;
		double s,a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of edges");
		n = scanner.nextInt();
		System.out.println("Enter a side length");
		s = scanner.nextDouble();
		scanner.close();
		
		a = (n * s* s) / (4 * (Math.tan(Math.PI / n)));
		
		System.out.println("Area ="+ a);
		
	}

}
