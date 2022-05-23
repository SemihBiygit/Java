package com.bilgeadam.boost.java.lesson023;

import java.util.LinkedHashSet;

// verileri eklediğimiz sırada alıyoruz.

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<String> days = new LinkedHashSet<>();

		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");

		days.remove("Sunday");

		for (String day : days) {
			System.out.println(day);
		}

	}

}
