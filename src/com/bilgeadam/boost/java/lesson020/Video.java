package com.bilgeadam.boost.java.lesson020;

public class Video extends Product implements Rentable {
	private String actor;
	private String language;

	public Video(String actor, String language) {
		super();
		this.actor = actor;
		this.language = language;
	}

	public String getActor() {
		return this.actor;
	}

	public String getLanguage() {
		return this.language;
	}

	@Override
	public String toString() {
		return "Video [actor=" + this.actor + ", language=" + this.language + "]";
	}
	@Override
	public double endPrice(double discountRate) {

		return this.getPrice()* 0.18;
	}

	@Override
	public double dailyRentPrice() {
		return 10.37;
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
