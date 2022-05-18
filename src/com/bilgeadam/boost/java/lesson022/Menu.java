package com.bilgeadam.boost.java.lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {

	
	public static int randomlyPick(int number) {
		Random random = new Random();
		int randomChoice = random.nextInt();
		return randomChoice;
	}
	
	public static String days() {
		String [] day = new String[7];
		day[0] = "Monday";
		day[1] = "Tuesday";
		day[2] = "Wednesday";
		day[3] = "Thursday";
		day[4] = "Friday";
		day[5] = "Saturday";
		day[6] = "Sunday";
		
		return day[randomlyPick(6)];
	}
	
	public static List<String> mainCourse() {
		List<String> mainCoursesList = new ArrayList<>();
		mainCoursesList.add("Chicken");
		mainCoursesList.add("Steak");
		mainCoursesList.add("Kebab");
		mainCoursesList.add("Pasta");
		mainCoursesList.add("Pizza");
		
		return mainCoursesList;
	}
	
	public static String randomMainCourse() {
		return mainCourse().get((randomlyPick(mainCourse().size())));
	}
	
	public static String sideCourse() {
		List<String> sideCoursesList = new ArrayList<>();
		sideCoursesList.add("Chicken Soup");
		sideCoursesList.add("Tomato Soup");
		sideCoursesList.add("Carrot Soup");
		return sideCoursesList.get(randomlyPick(sideCoursesList.size()));
	}
	
	public static void main(String[] args) {
		
		String day = days();
		String mainCourse = randomMainCourse();
		String sideCourse = sideCourse();
		
		System.out.println(day+" "+mainCourse+" ");
		
	}
}