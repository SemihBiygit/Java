package com.bilgeadam.boost.java.lesson024.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.bilgeadam.boost.java.lesson023.OrderNamesComparator;

public class LambdaExpressions {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("semih", "tugce", "alp", "nisa", "sarp");

//		Collections.sort(names, new OrderNamesComparator());
//		System.out.println(names);

		Collections.sort(names, (String a, String b) -> a.compareTo(b));
		System.out.println(names);

		Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println(names);

	}

}
