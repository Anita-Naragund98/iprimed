package com.prodapt.ass.example5;

public interface VotingInterface {
	
	void checkingAge(int x);

	default void normalMethod() {
		System.out.println("Hello");
	}

}
