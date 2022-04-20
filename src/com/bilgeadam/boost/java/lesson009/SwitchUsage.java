package com.bilgeadam.boost.java.lesson009;

import java.util.Scanner;

public class SwitchUsage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int note = scanner.nextInt();
		scanner.close();
		
		int evaluatedNote = note/10;
		switch (evaluatedNote) {
		case 10:
		case 9:
			System.out.println("Note: A");
			break;
		case 8:	
			System.out.println("Note: B");
			break;
		case 7:	
			System.out.println("Note: C");
			break;
		case 6:	
			System.out.println("Note: D");
			break;
		case 5 , 4 , 3 , 2 , 1:
			System.out.println("Note: F");
			break;
	default :
		System.out.println("Wrong note");
		}
	}

}
