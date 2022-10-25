package com.Comparable;

//importing package
import java.util.ArrayList;
import java.util.Collections;

//declaring class
public class StudentList {

	// calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> myclass = new ArrayList<Student>();
		myclass.add(new Student(12, "Raj", 26));
		myclass.add(new Student(16, "Tina", 23));
		myclass.add(new Student(21, "Krushikesh", 24));
		myclass.add(new Student(23, "Abdul", 20));
		myclass.add(new Student(10, "Shree", 26));

		Collections.sort(myclass);
		for (Student s : myclass) {
			System.out.println(s);
		}
	}

}
