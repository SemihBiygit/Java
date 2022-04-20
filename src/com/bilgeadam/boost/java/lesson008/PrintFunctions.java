package com.bilgeadam.boost.java.lesson008;

import javax.swing.JOptionPane;

public class PrintFunctions {

	public static void main(String[] args) {
		String name = "Semih";
		String surname = "Biygit";
		String error = "Oops. Something went wrong.";

		// println sorumluluğunda olan kısmı yazdırdıktan sonra bir alt satıra geçer
		System.out.println(name);
		System.out.println(surname);

		// print yazdırdıktan sonra alt satıra geçmez. Aynı satırda devam eder
		System.out.print(name + " ");
		System.out.print(surname);

		// hata penceresi oluşturma
		JOptionPane.showMessageDialog(null, error, "System Error", 0);

	}
}