package com.bilgeadam.boost.java.lesson010;

import java.util.Scanner;

public class RightTriangleStar {

	public static void main(String[] args) {
		int i,j,n;
		String str = "";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Please enter a number:");
		if(scanner.hasNextInt()) {
			n =scanner.nextInt();
		for(i=1; i<=n; i++) 
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
				System.out.println();
		}		
		}else {
			System.err.println("Wrong Entry");
			System.out.println("Do you want to continue?(Y)");
			scanner.nextLine();
			str=scanner.nextLine();
			
		}
		}while(str.equalsIgnoreCase("Y"));
	}
}