package com.bilgeadam.boost.java.lesson026;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ReadDataExample {

	public static void main(String[] args) {

		File inputFile = new File("C:\\Users\\semih\\Desktop\\FileExample\\values.dat");
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(inputFile)));) {
			while (true) {
				Double value = in.readDouble();
				System.out.println(value);
			}

		} catch (Exception e) {
			System.err.println("Something went wrong! Cause: " + e.getMessage());
		}

	}

}
