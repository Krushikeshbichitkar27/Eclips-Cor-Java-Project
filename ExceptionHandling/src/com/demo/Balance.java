package com.demo;

import java.util.Scanner;

public class Balance
{

	public static void main(String[] args) throws Account
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Balance ");
		
		double b=sc.nextDouble();
		if(b<1000)
		{
			throw new Account(b);
			
		}
		else
			System.out.println("Valid");
	}

}
