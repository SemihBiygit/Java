package com.bilgeadam.boost.java.lesson022;

import java.util.ArrayList;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();

		list1.add("Semih");
		list1.add("Biygit");

		list2.addAll(list1); //list1 i list2 ye aktardık.
		System.out.println(list1);
		System.out.println(list2);
		list1.set(0, "Tugce"); // listenin 0. elemanını değiştirdik.
		list1.remove(0); // listenin 0. elemanını sildi.
		
		System.out.println(list1.get(0)); // ilk elemanı çağırdık
		System.out.println(list1.size()); // listenin içindeki element sayısını verir.
		System.out.println(list1.contains("Sami")); // listenin içinde verilen eleman var mı yok mu onu sorgular.

		

	}

}
