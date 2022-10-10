package com.demo;

public class ThreadScheduling implements Runnable {
	// calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadScheduling nr = new ThreadScheduling();
		Thread t1 = new Thread(nr, "Krushikesh");
		Thread t2 = new Thread(nr, "Raj");
		Thread t3 = new Thread(nr, "Pooja");

		t1.start();
		t2.start();
		t3.start();

	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(100);

			}
		} catch (InterruptedException e) {
			System.out.println(e);

		}
	}
}
