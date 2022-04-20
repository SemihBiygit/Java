package com.bilgeadam.boost.java.lesson009;

public class IfUsage {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		if (a == b) {
			System.out.println("Numbers are equal");
		}

		else {
			System.out.println("Numbers are not equal");
		}
		System.out.println("Bye Bye");
		
		String output = (a>b) ? "A is higher than B" : "B is equal to A or higher" ;
		System.out.println(output);
	}
	}