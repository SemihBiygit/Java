package com.bilgeadam.boost.java.lesson019.model.product;

import java.time.LocalDate;

public class MilkProduct extends Goods {
	MilkType type;
	String subProductName;

	public MilkProduct(String name, double purchasePrice, LocalDate purchaseDate, int stockedAmount, double sellPrice,
			String unit) {
		super(name, purchasePrice, purchaseDate, stockedAmount, sellPrice, unit);
	}

}
