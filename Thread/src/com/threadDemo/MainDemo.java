package com.threadDemo;

/*
 * if the class extends the thread class the thread can run by
 * creating an instance of the class and call its start() method.
 * 
 * and overriding its run() method
 */
//creating class
public class MainDemo extends Thread {
	// declaring run method
	/*
	 * public void run() { System.out.println("The code is inside the thread");
	 * 
	 * }
	 */

	// calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object
		MainDemo m = new MainDemo();
		MainDemo m1 = new MainDemo();
		m.setName("Krushikesh");
		m1.setName("Rahul");
		m.start(); // m start method
		m1.start(); // m1 start
		System.out.println("The thread is created with name :" + m.getName());
		System.out.println("The thread is created with name :" + m1.getName());

	}

}
