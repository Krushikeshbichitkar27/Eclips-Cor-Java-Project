package com.TotalNumber;


import java.util.Scanner;

public class SmallAndLarge {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Line :");
		String str=sc.nextLine();
		String words[]=str.split(" ");
		
		
		String small=words[0];
		String large=words[0];
		
		for(int i=0; i<words.length;i++)
		{
			if(small.length()>words[i].length())
				small=words[i];
			

			if(large.length()<words[i].length())
				large=words[i];
			
		}

		System.out.println("The Largest Word is :"+large);
		System.out.println("The Smallest Word is :"+small);
		
		
		sc.close();

	}

}
