package com.prodapt.ass.example5;

public class MainTest {
	public static void main(String args[]) {

		VotingInterface voting = (int votingAge) -> {
			if (votingAge < 18) {
				System.out.println("Sorry, You are not eligible for voting.\n");
			} else
				System.out.println("Congratulation! You are eligible for voting.\n");

		};
		voting.checkingAge(21);
	}

}
