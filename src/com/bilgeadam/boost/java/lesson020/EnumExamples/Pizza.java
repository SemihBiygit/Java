package com.bilgeadam.boost.java.lesson020.EnumExamples;

public class Pizza {

	Size pizzaSize;

	public Pizza(Size pizzaSize) {
		super();
		this.pizzaSize = pizzaSize;
	}

	public void orderPizza() {

		switch (pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium pizza");
			break;
		case LARGE:
			System.out.println("I ordered a large pizza");
			break;
		case EXTRALARGE:
			System.out.println("I ordered a extra large pizza");
			break;

		default:
			System.out.println("I dont know which pizza to order");
			break;
		}

	}
}
