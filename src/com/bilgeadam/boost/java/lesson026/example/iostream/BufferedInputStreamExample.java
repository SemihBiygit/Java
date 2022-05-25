package com.bilgeadam.boost.java.lesson026.example.iostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\semih\\Desktop\\eclipse-workspace\\Java\\src\\com\\bilgeadam\\boost\\java\\lesson026\\example\\input.txt");
			BufferedInputStream input = new BufferedInputStream(file);

			int i = input.read();

			while (i != -1) {
				System.out.print((char) i);

				i = input.read();
			}
			input.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
