package com.bilgeadam.boost.java.lesson014;

import java.util.Scanner;

public class PrinterManager {
	private Printer printer; //nesne özniteliği. PrinterManager'in bir yazıcısı var artık.
	
	
	public static void main(String[] args) {
		PrinterManager manager = new PrinterManager();
		manager.initPrinter();
		manager.startPrinting();
		manager.printer.statusReport();
	
	
		/*
		PrinterManager manager = new PrinterManager();
		manager.startPrintJob();
		
		Eğer startPrintJob()'u static olarak tanımlamaz isek o zaman printmanager sınıfından 
		bir nesne üretmemiz ve o nesnenin bir metodu olarak çağırmamız gerekirdi.
		*/
		
	}
	private void initPrinter() {	
		printer = new Printer();
		printer.setColorCapable(true);
		printer.setDublexCapable(true);
		printer.fillPaper(10);
		printer.setPrinterName("My printer.");
		
		//System.out.println(printer); //genel kontrol için. Atanan değerler doğru gösteriliyor mu?
}
	private void startPrinting() {
		Scanner in = new Scanner(System.in);
		while (true) {
		System.out.println("Kaç sayfa basmak istiyorsunuz?:  ");
		int numPages= in.nextInt();
		in.nextLine();
		if(numPages == 0) {
			break;
		}	
		
		boolean colorPrint = false;
		if (printer.isColorCapable()) {
			System.out.println("Renkli basmak ister misiniz? (E/H):  ");
			colorPrint = in.nextLine().equalsIgnoreCase("e");
		}
		
		boolean dublexPrint = false;
		if (printer.isDublexCapable()) {
			System.out.println("Arkalı önlü basmak ister misiniz? (E/H):  ");
			dublexPrint = in.nextLine().equalsIgnoreCase("e");
		}
		
		printer.startPrintJob(numPages,colorPrint,dublexPrint); 
		
	}
		in.close();
	}
}
