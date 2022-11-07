package com.threadDemo;
/*
 * min priority
 * max priority
 * normal priority
 * setPriority to set the thread priority
 * getPriority to print the treads priority
 * min=1 ,max=10, normal=5
 */

public class ThreadPriority extends Thread {
	public void run() {
		System.out.println("Running thread priority is :" + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority m1 = new ThreadPriority();
		ThreadPriority m2 = new ThreadPriority();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();

	}

}
