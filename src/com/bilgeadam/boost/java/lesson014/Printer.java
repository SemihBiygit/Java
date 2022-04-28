package com.bilgeadam.boost.java.lesson014;

public class Printer {
	private static final double CRITICAL_TONER_LEVEL = 0.1d;
	private static final double TONER_USAGE_PER_SHEET = 1d;
	
	private String printerName; 	//yazıcı ismi
	private double tonerLevel; 		//toner seviyesi
	private int printedBWPages; 	//toplamda kaç tane siyah beyaz basmış
	private int printedColPages; 	//toplamda kaç tane renkli basmış
	private boolean dublexCapable; 	//duplex printing yapabiliyor mu?
	private boolean colorCapable;  	//renkli printing yapabiliyor mu?
	private int numPaper; 			//yazıdaki kağıt sayısı
	
	public Printer() {
		this.tonerLevel 	 = 100.0;  //yeni bir yazıcı yarattığımızda tonerı dolu gelir
		this.printedBWPages  = 0;      //yeni bir yazıcı yarattığımızda toplam basılan S/B sayfa sayısı 0'dır.
		this.printedColPages = 0;	   //yeni bir yazıcı yarattığımızda toplam basılan renkli sayfa sayısı 0'dır.
		this.numPaper 		 = 0;	   //yeni bir yazıcı yarattığımızda içinde kağıt yok 	
	}
	
	public void startPrintJob(int numPages, boolean colorPrint, boolean dublexPrint) {
		if (isTonerLevelSufficient()) {
			System.err.println("Yeterli toner yok. Doldurulması gerekli!!");
			this.fillToner(100.0);
		}
		
		int printedSheets = 0; //basılmış sayfa adete
		while (printedSheets < numPages) {	//basılmış sayfa istenilenden sayfadan az ise basmaya devam et.
			if(!isPaperAvailable()) {
				System.err.println("Yazıcıda kağıt kalmadı!!Lütfen kağıt ekleyin.");
				this.fillPaper(50);
			}
			printedSheets= printPage(printedSheets,colorPrint,dublexPrint);
			
		}
		this.endPrintJob();
	}
	
	private int printPage(int sheetNumber,boolean colorPrint,boolean dublexPrint) {
		sheetNumber++;
		System.out.println(sheetNumber+". sayfa basıldı");
		if(dublexPrint) {
			this.tonerLevel = this.tonerLevel -Printer.TONER_USAGE_PER_SHEET *2;
			this.numPaper--;
		}
		else {
			this.tonerLevel = this.tonerLevel -Printer.TONER_USAGE_PER_SHEET;
			this.numPaper-=2;
		}
		if (colorPrint) {
			this.printedColPages++;
		}
		else {
			this.printedBWPages++;
		}	
		
		return sheetNumber;
		
		
	}

	private boolean isPaperAvailable() {
		return (this.numPaper/2) > 0;  //bir yağrağa bir veya iki sayfa basılabilir(duplex olup olmamasına bağlı)
	}									// o yüzden yüklenen sayfa adedini 2 ile çarpmıştık.

	private void endPrintJob() {
		System.out.println("Baskı başarı ile tamamlandı.");
		this.statusReport();
		
	}

	private boolean isTonerLevelSufficient() {
		return this.tonerLevel >=Printer.CRITICAL_TONER_LEVEL ;
	}

	public void statusReport() {
		System.out.println("Printer name: \t"+ this.printerName);
		int totalPages = printedBWPages + printedColPages;
		System.out.println("Printed page number: \t"+ totalPages);
		if (totalPages >0 ) {
			double printedRate =(double)(printedBWPages / totalPages);
			double printedColorRate = 1- printedRate;
			System.out.println("B/W printed page number \t"+ printedBWPages+"\t ("+printedRate*100+"%)");
			System.out.println("Color printed page number \t"+ printedColPages+"\t ("+printedColorRate*100+"%)");
		}
	}	
	@Override
	public String toString() {
		return "Printer [printerName=" + printerName + ", tonerLevel=" + tonerLevel + ", printedBWPages="
				+ printedBWPages + ", printedColPages=" + printedColPages + ", dublexCapable=" + dublexCapable
				+ ", colorCapable=" + colorCapable + ", numPaper=" + numPaper + "]";
	}


	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}
	public void fillToner(double tonerLevel) {
		if (tonerLevel>100) { //en fazla %100 oluyor
			tonerLevel =100.0;
		}
		this.tonerLevel = tonerLevel;
	}
	public void setPrintedBWPages(int printedBWPages) {
		this.printedBWPages = printedBWPages;
	}
	public void setPrintedColPages(int printedColPages) {
		this.printedColPages = printedColPages;
	}
	public void setDublexCapable(boolean dublexCapable) {
		this.dublexCapable = dublexCapable;
	}
	public void setColorCapable(boolean colorCapable) {
		this.colorCapable = colorCapable;
	}
	public void fillPaper(int paperAmount) {
		this.numPaper = paperAmount *2;
	}
	public boolean isDublexCapable() {
		return dublexCapable;
	}
	public boolean isColorCapable() {
		return colorCapable;
	}

	}