package com.bilgeadam.boost.java.lesson022;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {

		Queue<String> languages = new LinkedList<>();

		languages.add("Java");
		languages.add("C++");
		languages.add("GoLang");
		System.out.println(languages);

		String language = languages.peek(); // en üstteki elemana erişir.
		System.out.println(language);

		String lng = languages.poll(); // ilk elemana erişir ve siler.
		System.out.println(lng);
		System.out.println(languages);
		
		languages.offer("JavaScript"); // listenin sonuna eleman ekliyor.
		System.out.println(languages);
	
	}
	

}
