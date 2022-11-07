package com.threadDemo;

public class ThreadExample extends Thread {
	public void run() {
		amount++;

	}

	public static int amount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample t1 = new ThreadExample();
		t1.start();

		// wait for the thread to finish
		while (t1.isAlive()) {
			System.out.println("Waiting......");
		}
		// update amount and print its value
		System.out.println("Value :" + amount);
		amount++;
		System.out.println("Value :" + amount);

	}

}
