package com.bilgeadam.boost.java.lesson020;

public class Book extends Product implements Rentable {

	private String author;
	private int year;

	public Book(String author, int year) {
		this.author = author;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [author=" + this.author + ", year=" + this.year + "]";
	}

	public String getAuthor() {
		return this.author;
	}

	public int getYear() {
		return this.year;
	}

	@Override
	public double endPrice(double discountRate) {

		return this.getPrice() * discountRate * 0.18;
	}

	@Override
	public double dailyRentPrice() {
		return 5.83;
	}

	@Override
	public double rentalPrice(int duration) {
		if (this.getProductsInStock()>1) {
			return duration*this.dailyRentPrice();
		}
		System.err.println("Yeterli ürün yok");
		return -1;
	}

}