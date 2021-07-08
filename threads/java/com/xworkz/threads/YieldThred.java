package com.xworkz.threads;

public class YieldThred extends Thread{
	
	@Override
	public void run() {
		System.out.println("invoked run");
		
		for (int i = 0; i < 4; i++) {
			try {
				Thread.currentThread().sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing from YieldThred "+i);
		}
	}

}
