package com.demo;

public class ThreadTest1 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(Thread.currentThread() + " " + i);
		}
	}

	// calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadTest1 t1 = new ThreadTest1();
		t1.setName("Krushikesh");
		ThreadTest1 t2 = new ThreadTest1();
		ThreadTest1 t3 = new ThreadTest1();

		t1.start(); // printed
		try {
			t1.join(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			t2.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // not run

		t3.start();

	}

}
