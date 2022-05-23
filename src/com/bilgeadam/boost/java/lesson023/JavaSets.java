package com.bilgeadam.boost.java.lesson023;

import java.util.HashSet;
import java.util.Iterator;


public class JavaSets {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		set.add("Semih");
		set.add("Tugce");
		set.add("Biygit");
		set.add(null);
		
		set.remove("Biygit");
		System.out.println(set.size());
		System.out.println(set.contains("Biygit"));
		
		for (String name : set) {
			System.out.println(name);
		}
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
