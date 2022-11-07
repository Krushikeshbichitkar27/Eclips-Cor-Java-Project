package com.threadDemo;
/*
 * The method sleep() is being used to halt the 
 * working of a thread for a given amount of time
 */

public class SleepExample extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			// thread will sleep for the 500 ms
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(Thread.currentThread() + " " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepExample s1 = new SleepExample();
		SleepExample s2 = new SleepExample();
		s1.setName("Krushikesh");
		s2.setName("Rahul");
		s1.start();
		s2.start();

	}

}
