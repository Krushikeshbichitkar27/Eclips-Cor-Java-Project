package com.overload;

public class Addition 
{
	// method overloading

	int add(int a, int b)
	{
		System.out.println("---2 Number---");
		int sum = a + b;
		return sum;
	}
	// method overloading

	int add(int a, int b, int c) {
		System.out.println("---3 Number---");
		int sum = a + b + c;
		return sum;
	}

}

