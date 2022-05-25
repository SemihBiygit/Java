package com.bilgeadam.boost.java.lesson026;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ReadWriteExample {

	public static void main(String[] args) {

		File inputFile = new File("C:\\Users\\semih\\Desktop\\FileExample\\Ölçüm Değerleri.txt");
		File outputFile = new File("C:\\Users\\semih\\Desktop\\FileExample\\values.dat");

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				FileOutputStream fos = new FileOutputStream(outputFile);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				DataOutputStream out = new DataOutputStream(bos);
			) {
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				
				out.writeDouble(Double.parseDouble(line));
				System.out.println(line);
			}
		} catch (Exception e) {
			System.err.println("Something went wrong! Cause: " + e.getMessage());
		}

	}

}
