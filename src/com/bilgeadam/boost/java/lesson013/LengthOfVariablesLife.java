package com.bilgeadam.boost.java.lesson013;

public class LengthOfVariablesLife {
	private double totalAmount; //örnek değişkeni
	
	public static void main(String[] args) {
		LengthOfVariablesLife life = new LengthOfVariablesLife();
		life.calculate(14,100);
		System.out.println(life.totalAmount);				
	}

	private void calculate(double rate, int amount) { //rate : argüman = yerel değişken
		double taxRate = rate / 100 ; //yerel değişken
		double total = 0;
		if (taxRate >0) {
			double taxAmount;
			taxAmount = taxRate * amount;
			total = amount + taxAmount;
			this.totalAmount = total;
		}
		System.out.println("Toplam : "+ total);
	}
}
