package com.bilgeadam.boost.java.lesson015;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors! ");
		int playerScore = 0;
		int computerScore= 0;
		
		while(true) {
		System.out.println("What is your move? rock-paper-scissors-quit");
		String userMove = in.nextLine();
		
		if(userMove.equals("quit")) {
			System.out.println("Exitting the game...");	
			break;
		}
		if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
			System.err.println("Your move is not valid!!");
		}
		else {Random random = new Random();
			int rand = random.nextInt(3);
			String computerMove="";
		
			if (rand==0) {
				computerMove="rock";
			}else if (rand==1) {
				computerMove="paper";
			}else {
				computerMove="scissors";
			}
			System.out.println("Computer's move is: "+computerMove);
		
			if (userMove.equals(computerMove) ) {
				System.out.println("It's a tie! Score is: Computer :"+computerScore+" You :"+playerScore);
				
			}else if (userMove.equals("rock") && computerMove.equals("scissor") || userMove.equals("scissors") && 
					computerMove.equals("paper") || userMove.equals("paper")&& computerMove.equals("rock")) {
				playerScore++;
				System.out.println("You won!Score is: Computer :"+computerScore+" You :"+playerScore);
			}else {
				computerScore++;
				System.out.println("You lost !Score is: Computer :"+computerScore+" You :"+playerScore);
			}
			
			}
		
		}
	}	
}