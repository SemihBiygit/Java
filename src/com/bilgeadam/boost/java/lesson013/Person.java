package com.bilgeadam.boost.java.lesson013;

public class Person {
	private static int numOfPersons = 0; //Class değişkenleri
	/*
	 * Nesne/Instance değiişkenleri (nesne öznitelikleri)
	 */
	
	private String firstName;
	private String lastName;
	private int age;
	
	public static void main(String[] args) {
		Person person = new Person();
		
		System.out.println(person.toString()); // sınıf ve örnek değişkenlerine Java otomatik olarak ilk değer atar
											   // sayı türleri 0 , boolean türü false ve diğerleri null şeklinde. 				
		person.age = 12;
		person.firstName = "Ahmet";
		person.lastName = "Mehmet";
		Person.numOfPersons++;
		System.out.println(person.toString());
		
		int daysLived; //local değişken
		
		
		daysLived = person.age*365;
		System.out.println(daysLived);
		System.out.println("Number of persons created" + Person.numOfPersons);

	}
		private String getName() {
			String fullName = this.firstName+" "+this.lastName; //yerel/locak değişken
			return fullName;
			}
	
	@Override
		public String toString() {
			return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
			}

}