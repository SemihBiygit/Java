package com.bilgeadam.boost.java.lesson019.model.product;

import java.time.LocalDate;

public class Goods extends Product implements Sellable {
	private double sellPrice;
	private String unit;

	public Goods(String name, double purchasePrice, LocalDate purchaseDate, int stockedAmount, double sellPrice,
			String unit) {
		super(name, purchasePrice, purchaseDate, stockedAmount);
		this.sellPrice = sellPrice;
		this.unit = unit;
	}

	@Override
	public double calculateEndPrice(double discountRate) {
		return this.sellPrice * (1 - discountRate);
	}

	@Override
	public void sell(int sellingAmount) {
		double endPrice = this.calculateEndPrice(0.2);
		this.stockedAmount -= sellingAmount;
		System.out.println("Son fiyat: " + endPrice + "Stok: " + stockedAmount);
		notifySell();
	}

	public double getSellPrice() {
		return this.sellPrice;
	}

	public String getUnit() {
		return this.unit;
	}

	@Override
	public String toString() {
		return "Goods [sellPrice=" + this.sellPrice + ", unit=" + this.unit + ", toString()=" + super.toString() + "]";
	}

}