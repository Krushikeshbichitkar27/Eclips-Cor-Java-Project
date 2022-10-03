package com.TotalNumber;

import java.util.Scanner;

public class CountWord1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Line :");
		String str=sc.nextLine();
		String words[]=str.split(" ");
		
		for(int i=0; i<words.length;i++) 
		{
		System.out.println(words[i]);	
		}
		sc.close();

	}

}
