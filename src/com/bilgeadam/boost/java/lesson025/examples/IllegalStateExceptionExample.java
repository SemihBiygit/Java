package com.bilgeadam.boost.java.lesson025.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateExceptionExample {

	public static void main(String[] args) {

		processArray();

	}

	public static void processArray() {
		List names = new ArrayList<>();
		names.add("Semih");
		names.add("Biygit");
		names.add("Tugce");

		Iterator iterator = names.iterator();
		try {
			while (iterator.hasNext()) {
				iterator.remove();
			}
		} catch (IllegalStateException e) {
			System.out.println("Gotcha: "+e.getMessage());
		}
	}
}
