package com.threadDemo;
/*
 * the thread can be run by passing an instance of the class to  
 * a thread objects constructor and then calling the threads
 * start() method
 */

public class Main implements Runnable {
	public void run() {
		System.out.println("The code is inside the thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		Thread t = new Thread(m, "krushikesh");
		t.start();
		System.out.println("The name of the thread:" + t.getName());

	}

}
