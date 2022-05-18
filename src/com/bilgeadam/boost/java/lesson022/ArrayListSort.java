package com.bilgeadam.boost.java.lesson022;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Semih");
		list.add("Tugce");
		list.add("Biygit");

		System.out.println("List: " + list);

		Collections.reverse(list); // listeyi tersine çevirme
		System.out.println("Reversed List :" + list);

		Collections.sort(list);
		System.out.println("Sorted List :" + list); // alfebetik sıralama

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reversed Sorted List :" + list); // ters alfabetik sıralama

	}

}
