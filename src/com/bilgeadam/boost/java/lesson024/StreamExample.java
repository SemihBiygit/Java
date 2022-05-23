package com.bilgeadam.boost.java.lesson024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		String[] customerArray = { "Müşteri1", "Müşteri2", "Müşteri3", "Müşteri4", "Müşteri5", "Müşteri6", "Müşteri7" };
		List<String> customers = Arrays.asList(customerArray); // 1.yol

		List<String> list = Arrays.asList("Müşteri1", "Müşteri2", "Müşteri3", "Müşteri4", "Müşteri5", "Müşteri6",
				"Müşteri7"); // 2. yol

		List<String> customerList = new ArrayList<>(); // 3. yol
		customerList.add("Müşteri1");
		customerList.add("Müşteri2");
		customerList.add("Müşteri3");
		customerList.add("Müşteri4");
		customerList.add("Müşteri5");
		customerList.add("Müşteri6");
		customerList.add("Müşteri7");

		Stream<String> stream = list.stream();
		Stream<String> parallel = list.parallelStream();

	}

}
