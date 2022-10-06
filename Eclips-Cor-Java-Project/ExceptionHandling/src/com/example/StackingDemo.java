package com.example;

public class StackingDemo
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
			try 
			{
			System.out.println("In method 2");
			method3();
			}
			catch(Exception e) {
				System.out.println("Divide by zero is not possible");
			}
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

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		method1();

	}

}
