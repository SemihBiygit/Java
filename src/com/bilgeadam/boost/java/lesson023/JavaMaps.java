package com.bilgeadam.boost.java.lesson023;

import java.util.HashMap;
import java.util.Map;

public class JavaMaps {

	public static void main(String[] args) {
		// creating a map using the hashmap
		Map<String, Integer> numbers = new HashMap<>();
		// Insert elements to the map
		numbers.put("One", 1);
		numbers.put("Two", 2);
		System.out.println("Map: " + numbers);
		// access keys of the map
		System.out.println("Keys:"+numbers.keySet());
		// access values of the map
		System.out.println("Numbers: "+numbers.values());
		// access the entries of the map
		System.out.println(numbers.entrySet());
	}

}
