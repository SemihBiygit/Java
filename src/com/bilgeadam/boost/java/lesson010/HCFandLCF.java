package com.bilgeadam.boost.java.lesson010;

import java.util.Scanner;

public class HCFandLCF {

	public static void main(String[] args) {
	  int a, b, i, hcf = 0;
	    
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter first number : ");
	      a = sc.nextInt();
	      System.out.println("Enter second number : ");
	      b = sc.nextInt();
	      sc.close();

	  for(i = 1; i <= a || i <= b; i++) {
	         if( a%i == 0 && b%i == 0 )
	         hcf = i;
	      }
	  int lcf = (a+b) / hcf;
	      System.out.printf("HCL of %d and %d is %d \n", a,b,hcf );
	      System.out.printf("LCF of %d and %d is %d \n", a,b,lcf );
	   }
	}