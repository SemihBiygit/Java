package com.bilgeadam.boost.java.lesson010;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Please enter a word = ");
		String palindromeCandidate = scanner.nextLine();

		palindromeCandidate = palindromeCandidate.trim();			//girilen metnin baş ve sonundaki boşlukları silmek için
		int length 			= palindromeCandidate.length();			//girilen metnin uzunluğunu öğrenmek için
		palindromeCandidate = palindromeCandidate.toLowerCase();	//girilen metni tümüyle küçük harflere döndürmek için
		
		boolean isPalindrome = true;
		for(int i=0; i<=length/2; i++) {
			if(palindromeCandidate.charAt(i) != palindromeCandidate.charAt(length - i -1)) {
				isPalindrome = false;
				break;
			}
		}
		String result = palindromeCandidate +" is "+ (isPalindrome ? "palindrome." : "not palindrome.");
		System.out.println(result);
		scanner.close();
		
		System.out.println("Bye Bye");

	}

}
