package com.demo;
import java.util.Scanner;

public class ThrowDemo 
{
	static void cheackAge(int age)
	{
		try 
		{
			 if(age < 18) 
			 {
				    throw new ArithmeticException("Person can not vote ");
			 }
				   else
				   {
				    System.out.println("Valid to vote");
				   }
		
		}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 // Taking an empty string
		
		int age=16;
		  
		  cheackAge();
		  
	}

}
