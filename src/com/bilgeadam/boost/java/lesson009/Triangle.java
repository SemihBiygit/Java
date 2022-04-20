package com.bilgeadam.boost.java.lesson009;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		double x,y,z,a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter firt degree");
			x = scanner.nextDouble();
		System.out.println("Please enter second degree");
			y = scanner.nextDouble();
		System.out.println("Please enter firt edge");	
			a = scanner.nextDouble();
		System.out.println("Please enter second edge");
			b = scanner.nextDouble();
			scanner.close();
			
			z = (180-(x+y));
		double zRad = Math.toRadians(z);
		double temp = Math.pow(a, 2) + (b*b) - (2*a*b*(Math.cos(zRad)));
		System.out.println("Third edge ="+ Math.pow(temp, 0.5));
		
		System.out.println("Third degree =" + z);
	
	
	}

}
