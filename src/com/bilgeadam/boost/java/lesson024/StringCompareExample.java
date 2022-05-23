package com.bilgeadam.boost.java.lesson024;

public class StringCompareExample {

	public static void main(String[] args) {
		String s1 = "Happy";
		String s2 = "Coders";
		
		int result = s1.compareTo(s2);
		System.out.println(result);
		
		result = s2.compareTo(s1);
		System.out.println(result);

		result = s2.compareTo("Coders");
		System.out.println(result);

	}

}
