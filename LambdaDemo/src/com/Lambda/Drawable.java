package com.Lambda;

@FunctionalInterface
public interface Drawable 
{
	public void draw();  //we can having only one abstract method
	
	//public void print();
	//lambda which is not use multiple methods
	default void sayShape()
	{
		System.out.println("Shape");
		method1();
	}
	
	private void method1()
	{
		System.out.println("In Method 1");
	}

}
