package com.bilgeadam.boost.java.lesson022;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("C");
		languages.add("Python");

		System.out.println("Languages : " + languages);
		System.out.println("Language 2 :" + languages.get(1));
		languages.set(2, "JavaScript");
		System.out.println("Languages : " + languages);
		languages.remove(2);
		System.out.println("Languages : " + languages);
		
		for (String language : languages) { //iterate using for each loop
			System.out.println(languages);
		}

	}

}
