package com.bilgeadam.boost.java.lesson023;

// küçükten büyüğe sıralar ya da sıralama işlemi özelleştirilebilir.

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {

		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(3);
		tree.add(5);
		tree.add(0);
		tree.add(-15);
		tree.add(-123);
		tree.add(312);
		
		for (Integer numbers : tree) {
			System.out.println(numbers);
		}

	}
}
