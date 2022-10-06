package com.example;

public class Stacking 
{
	//crating method
	static void method1()
	{
		System.out.println("In method 1");
		method2();
	}
	//crating method
	static void method2()
	{
		System.out.println("In method 2");
		method3();
	}
	//crating method
	static void method3()
	{
		int a=20;
		int b=0;
		int d=a/b;
		System.out.println(d);
		System.out.println("In method 3");
	}
	
    //calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		method1();

	}

}
