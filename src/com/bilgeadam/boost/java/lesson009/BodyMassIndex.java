package com.bilgeadam.boost.java.lesson009;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		double height,weight,bmi;
		String gender;
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter gender (F/M)");
	gender = scanner.nextLine();
	System.out.println("Please enter height as a cm");
	height = scanner.nextDouble();
	scanner.nextLine();
	System.out.println("Please enter weight as a kg");
	weight = scanner.nextDouble();
	
	scanner.close();
	
	bmi = weight*10000/(height*height);
	
	System.out.println("Your BMI = "+bmi);
	
	if(gender.equals("F")) {
		if(bmi<19) {
			System.out.println("Slim");
		}else if(bmi<24) {
			System.out.println("Normal");
		}else if(bmi<30) {
			System.out.println("Fat");
		}else {
			System.out.println("Obese");
		}
	}
	else if(gender.equalsIgnoreCase("M")) {
		if(bmi<20) {
		System.out.println("Slim");
		}
		else if(bmi<25) {
		System.out.println("Normal");
		}
		else if(bmi<30) {
		System.out.println("Fat");
		}
		else {
		System.out.println("Obese");
		}
	}
	else {
		System.out.println("Wrong Data!!");
		}

	}
}
