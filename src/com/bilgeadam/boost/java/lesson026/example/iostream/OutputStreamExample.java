package com.bilgeadam.boost.java.lesson026.example.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample {

	public static void main(String[] args) {

		String data = "This is a line of text inside the file";
		
		try {
			OutputStream out = new FileOutputStream("C:\\Users\\semih\\Desktop\\eclipse-workspace\\Java\\src\\com\\bilgeadam\\boost\\java\\lesson026\\example\\output.txt");
			byte[] dataBytes = data.getBytes(); // converts the string into bytes.
			out.write(dataBytes);
			System.out.println("Data is written to the file. ");
			
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
