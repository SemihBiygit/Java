package com.bilgeadam.boost.java.lesson013;

public class Password {
	private String password;
	
	public Password() {
		super();
		
		this.password = "";
	}
	
	public boolean check (String password) {
		return password.equals(this.password);
	}
	
	public boolean assign (String oldPassword, String newPassword) {
		boolean isSuccessful = false;
		isSuccessful = this.check(oldPassword);
		if(isSuccessful && newPassword !=null) {
			this.password = newPassword;
		}
		else {
			isSuccessful = false ;
		} 
		
		
		return isSuccessful;
	}
	
	private boolean checkSyntax(String password) {
		boolean isCorrect = false;
		
		char first = password.toLowerCase().charAt(0);   //pasword'u küçük harflere çevirip (=toLowercase()) ilk karakter'i (charAt(0)) bir değişkene atadık.
		isCorrect = (first != password.charAt(0));       //passwordun ilk karakteri ile first'ü karşılaştırdım eğer birbirine eşit ise o zaman password küçük harfle
														// başlıyor demektir ve kontrolü geçmiyor anlamına gelir.
		
		return isCorrect;
	}
	
}
