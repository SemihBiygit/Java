package com.bilgeadam.boost.java.lesson024;

import java.util.Arrays;

public class NameSortExample {

	public static void main(String[] args) {

		String [] names = {"Ali","Fatma","Veli","Semih","Tugce"};
		Arrays.sort(names); //alfabetik sıralama
		System.out.println(Arrays.toString(names));

		Arrays.sort(names, StringLengthComparator.COMPARATOR); //az harften çok harfe sıralama 
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, StringLengthComparator.ASC); //az harften çok harfe sıralama
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, StringLengthComparator.DSC); //çok harften az harfe sıralama
		System.out.println(Arrays.toString(names));
	}

}
