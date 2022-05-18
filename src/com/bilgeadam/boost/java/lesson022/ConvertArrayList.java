package com.bilgeadam.boost.java.lesson022;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayList {

	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList<>();

		languages.add("Java");
		languages.add("C#");
		languages.add("Python");

		System.out.println(languages);

		String[] arr = new String[languages.size()]; // create a new array of String type.

		languages.toArray(arr); // convert arrayList to array
		for (String language : arr) {
			System.out.println(language);
		}
		
		ArrayList<String> language2 = new ArrayList<>(Arrays.asList(arr)); // create an arrayList from an array.
		System.out.println(language2);

	}
}
