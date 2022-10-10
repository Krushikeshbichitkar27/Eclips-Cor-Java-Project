package com.demo;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo r1 = new RunnableDemo();
		// Thread t1=new Thread(r1);
		// t1.start();

		Thread t1 = new Thread("My Thread");
		// r1.run();
		t1.start();
		System.out.println(Thread.currentThread());
		System.out.println(t1.getPriority());

	}

	public void run() {
		System.out.println("Thread is running");
	}
}
