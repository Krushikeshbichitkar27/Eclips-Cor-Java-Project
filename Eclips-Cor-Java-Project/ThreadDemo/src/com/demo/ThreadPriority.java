package com.demo;

public class ThreadPriority extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(Thread.currentThread() + " " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current thread priority : " + Thread.currentThread().getPriority());
		// Thread.currentThread().setPriority(MAX_PRIORITY);
		// Thread.currentThread().getPriority();

		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();

		t1.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();

	}

}
