package com.bilgeadam.boost.java.lesson020;

public abstract class Product {

	private String name;
	private int price;
	private int productsInStock;

	public abstract double endPrice(double discountRate);
	
	public void sell (int amount,double discountRate) {
		if (amount <= this.productsInStock) {
			double endPrice = this.endPrice(discountRate);
			System.out.println(amount+ " adet "+this.name+" "+ endPrice+ " fiyatına satıldı.");
			this.productsInStock -= amount;
		}else {
			System.err.println("Yeterli ürün bulunmuyor");
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductsInStock() {
		return this.productsInStock;
	}

	public void setProductsInStock(int productsInStock) {
		this.productsInStock = productsInStock;
	}

	@Override
	public String toString() {
		return "Product [name=" + this.name + ", price=" + this.price + ", productsInStock=" + this.productsInStock
				+ "]";
	}
}
