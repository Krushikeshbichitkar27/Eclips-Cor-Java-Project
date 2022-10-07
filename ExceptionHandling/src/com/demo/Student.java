package com.demo;

import java.util.Scanner;

public class Student
{
	
//throws : declare an exception : checked exception
	public static void main(String[] args) throws CustomException
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age ");
		
		int a=sc.nextInt();
		if(a<18)
		
			throw new CustomException(a);
		
		
sc.close();
	}

}
