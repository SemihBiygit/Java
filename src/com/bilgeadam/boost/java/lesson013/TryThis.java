package com.bilgeadam.boost.java.lesson013;

public class TryThis {

	int variable=15; //sınıf değişkeni yarattım
	
	public static void main(String[] args) {
		int variable = 10;  //main method içerisinde değişkene değer atadım.
		
		TryThis tryThis = new TryThis(); //bu sınıftan bir nesne oluşturdum
		
		System.out.println(tryThis.test(variable)); //oluşturduğum nesnenin methodunu kullandım.Parametre olarak içine de main methodda değer atadığım değişkeni verdim.
		
		System.out.println(variable); //main method içinde değerini belirlediğim değişkeni konsola yazdırdım.
		
		System.out.println(tryThis.variable);  //sınıf içerisinde oluşturduğum değişkeni konsola yazdırdım.
		
	}

	int test (int variable) { //metod yarattım
		variable +=25; //methodun parametre olarak içine aldığı değeri kullandım.
		System.out.println(variable);
		return this.variable;
	}
	
}
