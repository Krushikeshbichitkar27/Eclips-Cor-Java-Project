package com.demo;

public class DaemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon())
			System.out.println(Thread.currentThread().getName() + ": Daemon thread working----");
		else
			System.out.println(Thread.currentThread().getName() + " : User thread working---- ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread d1 = new DaemonThread();
		DaemonThread d2 = new DaemonThread();
		DaemonThread d3 = new DaemonThread();

		d1.setDaemon(true); // throw an exception
		d1.start();
		d2.start();
		d3.start();

	}

}
