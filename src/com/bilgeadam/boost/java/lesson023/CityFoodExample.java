package com.bilgeadam.boost.java.lesson023;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityFoodExample {

	public static void main(String[] args) {

		Map<Integer, String> cities = new HashMap<>();
		cities.put(01, "Adana");
		cities.put(33, "Mersin");
		cities.put(16, "Bursa");
		cities.put(38, "Kayseri");
		cities.put(02, "Adiyaman");

		Map<String, String> foods = new HashMap<>();
		foods.put("Adana", "Kebab");
		foods.put("Mersin", "Tantuni");
		foods.put("Bursa", "Iskender");
		foods.put("Kayseri", "Manti");
		foods.put("Adiyaman", "Cigkofte");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter city No: ");
		int cityNo = scanner.nextInt();
		String city = cities.get(cityNo);
		String food = foods.get(city);
		System.out.println("City is "+city+" and famous food is "+food);
		scanner.close();
	}

}
