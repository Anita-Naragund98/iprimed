package com.xworkz.dead_lock;

public class DeadLockDemo {
	public static void main(String[] args) {

		Pencil pen = new Pencil();
		Ruler rul = new Ruler();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (pen) {
					System.out.println("Thread1 got lock on pencil");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread1 is waiting to get Ruler............");
					synchronized (rul) {
						System.out.println("Thread1 got lock on ruler");
						System.out.println("Thread1 completed drawing picture");
					}
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (rul) {
					System.out.println("thread2 got lock on ruler");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("thread2 is waiting to get Pencil............");
					synchronized (pen) {
						System.out.println("thread2 got lock on pencil");
						System.out.println("thread2 completed drawing picture");
					}
				}
			}
		});
		thread1.start();
		thread2.start();

	}

}
