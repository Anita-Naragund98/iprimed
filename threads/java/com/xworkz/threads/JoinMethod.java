package com.xworkz.threads;

public class JoinMethod extends Thread{
	
	static Thread mt;
	@Override
	public void run() {
		System.out.println("invoked from child");
	}

}
