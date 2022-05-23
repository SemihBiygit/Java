package com.bilgeadam.boost.java.lesson019.product;

public interface Sellable {
	int price = 0; // public final int demek oluyor

	double calculateEndPrice(double discountRate);
	void sell(int sellingAmount);
	default void notifySell () {
		System.out.println("Ürün satıldı.");
	}
}

