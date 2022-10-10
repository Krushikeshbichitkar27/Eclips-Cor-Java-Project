package com.demo;

public class Thread1 extends Thread {

	Thread1(String name) {
		super(name);
	}

	// create constructor of thread1
	public Thread1() {
		// TODO Auto-generated constructor stub
		System.out.println("Thread is Started");
	}

	public void run() {
		System.out.println("Thread is running");

	}

	// calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1 = new Thread1();
		t1.start();

		Thread1 t2 = new Thread1();
		t2.setName("MyThread");
		t2.start();
		System.out.println("Thread name is :" + t2.getName());

	}

}
