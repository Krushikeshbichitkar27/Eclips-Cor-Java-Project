package com.AWTDemo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;

public class AWTExample1 extends Frame {
	// constructor
	public AWTExample1() throws HeadlessException {
		System.out.println("AWT");
		// create frame
		Frame f = new Frame();

		// creating button
		Button b1 = new Button("Click Me!");

		// creating label
		Label l1 = new Label("Student Id");

		// create text Field
		TextField tf1 = new TextField();

		// setting the postion and size on screen
		l1.setBounds(20, 80, 80, 30);
		tf1.setBounds(20, 100, 80, 30);
		b1.setBounds(100, 100, 80, 30); // x,y.length , height

		// add button to frame
		f.add(tf1);
		f.add(b1);
		f.add(l1);

		// set frame size
		f.setSize(300, 300);

		// setting layout
		f.setLayout(null);

		// to make button visible on frame
		f.setVisible(true);

	}

	public static void main(String... args) {
		AWTExample1 obj = new AWTExample1();
	}
}
