package com.bilgeadam.boost.java.lesson009;

import java.util.Scanner;

public class SwitchUsage2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int note = scanner.nextInt();
		scanner.close();
		
		int evaluatedNote = note/10;
		
		
		String harfNotu = switch (evaluatedNote) {
			case 9,10:
				yield "Note : A";
			case 8:
				yield "Note : B";
			case 7:
				yield "Note : C";
			case 6:
				yield "Note : D";
			case 5, 4, 3, 2, 1, 0:
				yield "Note : F";
			default:
				yield "Wrong note";
			
				};
			System.out.println("harf notu: " + harfNotu);
		}
	}
