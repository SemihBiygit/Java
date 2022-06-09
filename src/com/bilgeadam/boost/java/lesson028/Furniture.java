package com.bilgeadam.boost.java.lesson028;

import java.time.LocalDate;

public abstract class Furniture {
	private String name;
	private Material material;
	private Color color;
	private LocalDate productionDate;
	private double price;
	
	
	public Furniture(String name, Material material, Color color, LocalDate productionDate, double price) {
		super();
		this.name = name;
		this.material = material;
		this.color = color;
		this.productionDate = productionDate;
		this.price = price;
	}


	public Furniture(String name2, String material2) {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Furniture [name=" + this.name + ", material=" + this.material + ", color=" + this.color
				+ ", productionDate=" + this.productionDate + ", price=" + this.price + "]";
	}

	
}
