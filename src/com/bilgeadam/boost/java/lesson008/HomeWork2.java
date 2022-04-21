//Price without VAT and raw price calculation
package com.bilgeadam.boost.java.lesson008;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {

		double endPrice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter end price of product");
		endPrice = scanner.nextDouble();

		double priceWithoutVAT;
		priceWithoutVAT = ((endPrice * 100) / 118);
		System.out.println("Price without VAT = " + priceWithoutVAT);

		double rawPrice;
		rawPrice = ((priceWithoutVAT * 100) / 115);
		System.out.println("Raw Price = " + rawPrice);

		priceWithoutVAT = scanner.nextDouble();
		rawPrice = scanner.nextDouble();

	scanner.close();
		
	}

}
