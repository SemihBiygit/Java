package com.bilgeadam.boost.java.lesson014;

public class AnotherStaticExample {

	static int age;
	
	static void display() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		
		//static değişkene aynı sınıftan erişme
		age = 30;
		
		//statik methoda aynı sınıftan erişme
		display();
		
	}

}
