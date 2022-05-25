package com.bilgeadam.boost.java.lesson026;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
	public static void main(String[] args) {

//		File myFile = new File ("mektup.txt"); // göreceli/relative erişim. Programın çalıştığı yerden okur.
		File myFile = new File(
				"C:\\Users\\semih\\Desktop\\eclipse-workspace\\Java\\src\\com\\bilgeadam\\boost\\java\\lesson026\\mektup.txt"); // absolute/mutlak
																																// erişim.

		if (!myFile.exists()) {
			System.err.println("Dosya yok");
			System.exit(0);
		}

		try (FileReader fileReader = new FileReader(myFile); BufferedReader reader = new BufferedReader(fileReader);) {
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				} else {
					System.out.println("==> " + line);
				}
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
