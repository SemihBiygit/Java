package com.bilgeadam.boost.java.lesson019.product;

import java.time.LocalDate;

/*
 * demirbaş
 */

public class Asset extends Product {

	public Asset(String name, double purchasePrice, LocalDate purchaseDate, int stockedAmount) {
		super(name, purchasePrice, purchaseDate, stockedAmount);
	}

	private int numOfAssets;

}
