package com.bilgeadam.boost.java.lesson010;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1= 0;
		int n2= 1;
		int n3;
		int n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kac adet Fibonacci sayisi yazdirmak istersin?");
		n = scanner.nextInt();
		
		System.out.print(n1+" "+n2);
		
		for(int i = 2; i<n; ++i ) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		scanner.close();
	}

}
