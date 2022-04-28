package com.bilgeadam.boost.java.lesson014;

public class StaticExample2 {
	public static void main(String[] args) {
		
		StaticExample obj = new StaticExample();
		//statik olmayan değişkene erişim.
		System.out.println(obj.min);
		
		//statik değişkene erişim.
		System.out.println(StaticExample.max);
		
	}
}
