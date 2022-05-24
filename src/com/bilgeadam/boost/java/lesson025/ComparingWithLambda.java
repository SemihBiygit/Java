package com.bilgeadam.boost.java.lesson025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.bilgeadam.boost.java.lesson024.Student;

public class ComparingWithLambda {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student(1616, "Semih", "Biygit", LocalDate.of(1997, 1, 14)));
		students.add(new Student(3434, "Tugce", "Yakup", LocalDate.of(1997, 10, 30)));
		students.add(new Student(3434, "Ersan", "Kuneri", LocalDate.of(1949, 1, 1)));
		students.add(new Student(3434, "Sarp", "Oner", LocalDate.of(2022, 5, 20)));
		System.out.println(Arrays.toString(students.toArray()));

		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				long firstDate = o1.getBirthDate().toEpochDay();
				long secondDate = o2.getBirthDate().toEpochDay();
				return Long.compare(firstDate, secondDate);
			}
		});
		System.out.println("Order by birth date: "+Arrays.toString(students.toArray()));

		students.sort((stu1, stu2) -> {
			int result = stu1.getLastName().compareTo(stu2.getLastName());
			if (result ==0) {
				return stu1.getFirstName().compareTo(stu2.getFirstName());
			}
			else {
				return result;
			}
	});

			System.out.println("Order by lastname and firstname: "+Arrays.toString(students.toArray()));
			
			students.sort(Comparator.comparing(Student::getFirstName));
			System.out.println("Order by firstname: "+Arrays.toString(students.toArray()));
			
			students.sort(Comparator.comparing(Student::getLastName));
			System.out.println("Order by lastname: "+Arrays.toString(students.toArray()));
			
			
}
}