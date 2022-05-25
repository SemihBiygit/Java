package com.bilgeadam.boost.java.lesson026.example.file;

import java.io.File;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\semih\\Desktop\\eclipse-workspace\\Java\\src\\com\\bilgeadam\\boost\\java\\lesson026\\example\\output.txt");
		
		try {
			boolean value = file.createNewFile();
			
			if(value) {
				System.out.println("The new file is created");
			}else {
				System.out.println("The file already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
