package com.bilgeadam.boost.java.lesson026;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {

		File myFile = new File("C:\\Users\\semih\\Desktop\\FileExample");
		if (myFile.isFile()) {
			System.out.println("Is a file.");
		}

		if (myFile.isDirectory()) {
			System.out.println("Is a folder");
			String[] files = myFile.list();
			for (String fileName : files) {
				System.out.println(fileName);
				File file = new File(myFile, fileName);
				if (file.isFile()) {
					System.out.println(file.getName());
					System.out.println(file.getAbsolutePath());
					System.out.println(file.canExecute() ? "Erisebilir " : "Erisilemez");
					System.out.println(file.isHidden() ? "Gizli" : "Gizli degil");
					System.out.println(file.canRead() ? "Okunabilir" : "Okunamaz");
					System.out.println(file.canWrite() ? "Yazilabilir" : "Yazilamaz");
					System.out.println("\n==============================");
					
				}
			}
			
			File newFile = new File("C:\\Users\\semih\\Desktop\\FileExample\\My Third File.txt");
			if (newFile.exists()) {
				System.err.println("Dosya zaten var");
			}
			else {
				boolean success = false;
				try {
					success = newFile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (success) {
					System.out.println("Dosya yaratildi");
				}else {
					System.out.println("Dosya yaratilamadi");
				}
			}
		}

	}

}
