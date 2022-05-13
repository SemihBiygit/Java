package com.bilgeadam.boost.java.lesson020;

public class Library {

	public static void main(String[] args) {
		Book b1 = new Book("Yazar Semih", 1997);
		System.out.println(b1);
		b1.setPrice(100);
		b1.setProductsInStock(10);
		b1.sell(3, 0);
		b1.sell(2, 0.2);
		b1.sell(8, 0);
		b1.rentalPrice(5);
		System.out.println("Kira maliyeti:" +b1.rentalPrice(5));
		
		Magazine m1 = new Magazine("Semih", 2020, 161616);
		System.out.println(m1);
		m1.setPrice(100);
		m1.setProductsInStock(25);
		System.out.println(m1.endPrice(0.20));
		
		Video v1 = new Video("Tugce", "Turkce");
		v1.setPrice(55);
		v1.setProductsInStock(5);
		System.out.println("Kira maliyeti:" +v1.rentalPrice(5));
		
		
		
		
	}

}
