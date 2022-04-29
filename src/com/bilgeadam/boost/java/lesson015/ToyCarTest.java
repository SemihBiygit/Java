package com.bilgeadam.boost.java.lesson015;

import java.util.Scanner;

public class ToyCarTest {

	public static void main(String[] args) {

		ToyCar toyCar = new ToyCar();
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("w-Move Forward\na-Move Left\ns-Move Backward\nd-Move Right\nc-Charge\nWhat is your move?");
		String move = scanner.nextLine();
		
		switch (move) {
		case "w","W":
			toyCar.moveOneMeterForward();
			break;
		case "a","A":
			toyCar.moveOneMeterLeft();
			break;
		case "s","S":
			toyCar.moveOneMeterBackward();
			break;
		case "d","D":
			toyCar.moveOneMeterRight();
			break;
		case "c","C":
			toyCar.charge();
			break;

		default:
			System.err.println("Wrong entry!");
			break;
		}
		
		
		}
	}
}
