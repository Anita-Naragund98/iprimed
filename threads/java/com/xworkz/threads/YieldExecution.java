package com.xworkz.threads;

public class YieldExecution {

	public static void main(String[] args) {
		YieldThred thread=new YieldThred();
		thread.start();
		thread.interrupt();
		for (int i = 0; i < 6; i++) {
			System.out.println("from main thread : "+i);
			
		}
		/*
		 * try { thread.join(); } catch (InterruptedException e) { e.printStackTrace();
		 * }
		 */		
		/*for (int i = 0; i < 6; i++) {
			try {
				thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			//System.out.println("from YieldExecution  "+i);

	}

}
