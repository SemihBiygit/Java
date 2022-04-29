package com.bilgeadam.boost.java.lesson015;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
			Person person = new Person();
			Scanner scanner = new Scanner(System.in);
			Person person1 =new Person("sami","biygit","m",24);
			
			
			System.out.println("First name: ");
			person.setFirstName(scanner.nextLine());
			System.out.println("Last name: ");
			person.setLastName(scanner.nextLine());			
			System.out.println("Gender: ");
			person.setGender(scanner.nextLine());
			System.out.println("Age :");
			person.setAge(scanner.nextInt());
			
			scanner.close();
 			person.personInfo(); // personInfo methodu ile yazıldı
			
			Person person2 = new Person();
			
			person2.setFirstName("Semih");
			person2.setLastName("Biygit");
			person2.setGender("Male");
			person2.setAge(25);
			
			System.out.println(person); //to string ile yazıldı
			System.out.println(person1);
			
	}

}
