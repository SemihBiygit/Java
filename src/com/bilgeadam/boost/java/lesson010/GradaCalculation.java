package com.bilgeadam.boost.java.lesson010;

import java.util.Scanner;

public class GradaCalculation {

	public static void main(String[] args) {
		
		int midterm1,midterm2,finall;
		int grade ;
		String letterGrade = "" ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first midterm grade: ");
		midterm1=scanner.nextInt();
		System.out.println("Please enter the second midterm grade");
		midterm2=scanner.nextInt();
		System.out.println("Please enter the final grade");
		finall=scanner.nextInt();
		scanner.close();
		
		grade = (int) ((midterm1+midterm2)/2*0.4 + finall*0.6);
		
		switch ((grade < 50) ? "0:49" : (grade < 60) ? "50:59" : (grade < 70) ? "60:69" : (grade < 80) ? "70:79" : "80:100") {
		case "0:49" :
			letterGrade = "FF";
			break;
		case "50:59" :
			letterGrade = "DD";
			break;
		case "60:69" :
			letterGrade = "CC";
			break;
		case "70:79" :
			letterGrade = "BB";
			break;
		case "80:100" :
			letterGrade = "AA";
			break;
			
		default:
			System.err.println("Wrong Data!!");
			break;
		}
		System.out.println("Grade = "+ grade +" Letter Grade = " + letterGrade)
		;
		
		
		
	}

}
