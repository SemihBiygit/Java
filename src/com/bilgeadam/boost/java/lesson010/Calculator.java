package com.bilgeadam.boost.java.lesson010;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        	        
	        System.out.println("Enter the First Operand : ");
	        double first = scanner.nextDouble();
	        
	        System.out.println("Enter the Operator (+,-,*,/) : ");
	        char operator = scanner.next().charAt(0);
	        
	        System.out.println("Enter the Second Operand : ");
	        double second = scanner.nextDouble();
	        scanner.close();
	      
	        double result = 0;
	        
	        switch(operator){
	        case '+':
	            result = first + second;
	            break;
	        case '-':
	            result = first - second;
	            break;
	        case '*':
	            result = first * second;
	            break;
	        case '/':
	            result = first / second;
	            break;
	        }
	        
	        System.out.println("The Result is : \n "+first+" "+operator+" "+second+" = "+result);
	        
	    }
    
	
	}


