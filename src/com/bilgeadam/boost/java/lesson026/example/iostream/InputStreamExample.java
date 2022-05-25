package com.bilgeadam.boost.java.lesson026.example.iostream;

import java.io.FileInputStream;
import java.io.InputStream;

/*
 * -FileInputStream
 * -ByteArrayInputStream
 * -ObjectInputStream
 */

public class InputStreamExample {

	public static void main(String[] args) {
		byte[] array = new byte[10];
		
		try {
			InputStream input = new FileInputStream("C:\\Users\\semih\\Desktop\\eclipse-workspace\\Java\\src\\com\\bilgeadam\\boost\\java\\lesson026\\example\\input.txt");
			System.out.println("Available bytes in the files: "+input.available());
			
			input.skip(5);
			System.out.println("Input stream after skippin 5 bytes: ");
			
			input.read(array);
			System.out.println("Data read from the file: ");
			String data = new String(array);
			System.out.println(data);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
