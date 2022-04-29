package com.bilgeadam.boost.java.lesson015;

import java.util.Scanner;

public class LaptopTest {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		while (true) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("What would you like to configure?\n1-Set Brand Name\n2-Set RAM Size(gb)\n3-Set Battery Capacity(mAh)\n4-Set Screen Size(inch)\n5-Show System Configuration");
		String decision = scanner.nextLine();
		
		switch (decision) {
			case "1":
				laptop.setBrand(scanner.nextLine());
				laptop.showFeatures();
				break;
			case "2":
				laptop.setRamSize(scanner.nextInt());
				laptop.showFeatures();
				break;
			case "3":
				laptop.setBatteryCapacity(scanner.nextInt());
				laptop.showFeatures();
				break;
			case "4":
				laptop.setScreenSize(scanner.nextInt());
				laptop.showFeatures();
			break;
			case "5":
				laptop.showFeatures();
				break;

			default:
				System.err.println("Wrong entry!");
				break;
			}
	
		}
	}	
}
