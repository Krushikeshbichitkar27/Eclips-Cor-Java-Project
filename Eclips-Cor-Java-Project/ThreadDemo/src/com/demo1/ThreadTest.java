package com.demo1;

public class ThreadTest extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++)
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		int i = 0;
		System.out.println(Thread.currentThread() + " " + i);
	}

	// calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();

		t1.start(); // printed
		// t1.start(); // can not start thread multiple time
		t2.start();// not run

	}

}
