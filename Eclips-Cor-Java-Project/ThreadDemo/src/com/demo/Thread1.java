package com.demo;

//without synchronization
public class Thread1 extends Thread {
	// resource
	void printTable(int n) {
		for (int i = 1; i < 10; i++) {
			System.out.println(n * 1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void run() {
		printTable(7);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();

		t1.start();
		t2.start();
	}

}
