package com.bilgeadam.boost.java.lesson011;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = 3;
		int balance = 1500;
		int select;
		int amount;
		
		while(true) {
			count--;
			System.out.println("Please enter username: ");
			String userName = scanner.nextLine();
			System.out.println("Please enter password: ");
			String password = scanner.nextLine();
			
			if ((!userName.equals("user") || !password.equals("123"))) {
				System.err.println("Wrong entry!");
				
				if(count==0) {
					System.err.println("Your card has been blocked, please contact the bank. ");
				break;
				}else {
					System.out.println("Your remaining right is" +count);
				}
			}else {
				System.out.println("Welcome to the our bank!");
				while(true) {
					System.out.println("1-Deposit money\n"+"2-Withdraw money\n"+"3-Balance inquiry\n"+"4-Exit");
					System.out.println("Please make a choice");
					select= scanner.nextInt();
					switch (select) {
					
					case 1:
						System.out.println("Please enter the amount you want to deposit:");
						amount = scanner.nextInt();
						balance += amount;
						System.out.println(amount+" has been deposited into your account.");
						break;
					
					case 2:
						System.out.println("Please enter the amount you want to withdraw:");
						amount = scanner.nextInt();
						if(amount>balance) {
							System.err.println("You do not have enough funds in your account. ");
						}else {
							balance -= amount;
						System.out.println(amount+" has been withdrawn from your account. ");
						}
						break;
					
					case 3:
						System.out.println("You have "+balance+" in your account.");
						break;
					
					case 4:
						System.out.println("Exiting the system...");
						System.exit(0);
						break;
					
					
					
					default:
						System.err.println("An invalid value was entered");
						break;
						}
				
					}
			
				}
		
			}
		}
	}
