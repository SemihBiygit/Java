package com.bilgeadam.boost.java.lesson020;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Onuncu sayısı :");
		int numOfPlayers = in.nextInt();

		String[] players = new String[numOfPlayers];
		for (int i = 0; i < numOfPlayers; i++) {
			System.out.println((i + 1) + ". onuncunun adı: " + players[i]);
			players[i] = in.nextLine();
		}
		in.close();
	}
}