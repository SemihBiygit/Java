package com.bilgeadam.boost.java.lesson008;
/**
 *Celcius to fahrenheit converter
*@author Semih Biygit
*@version 1.0
*/
import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {

		double c;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a Celcius Temperature");
		c = scanner.nextDouble();

		double f;
		f = (c * 9 / 5) + 32;

		System.out.println("Fahrenheit Temperature = " + f);
		scanner.close();
	
	}

}
