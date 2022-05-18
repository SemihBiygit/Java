package com.bilgeadam.boost.java.lesson022;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> numbers = new LinkedList<>();
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");

		System.out.println("Numbers: " + numbers);
		System.out.println(numbers.get(2)); // 3. elamanı çağırdık.
		System.out.println(numbers.indexOf("Two")); // indexOf ile liste içindeki elemanın kaçıncı sırada olduğunu bulur.
		

	}

}
