package com.token;

import java.util.*;


public class SplitToken 
{
	static void findWords(String str)
	{
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreElements());
		{
			System.out.println(st.nextToken());//it is printing next word
		}
	}
	
	static void countWords(String str)
	{
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreElements());
		{
			System.out.println("Number of words :"+st.countTokens());//it is printing count of word
		}
	}
	//calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String inputString =sc.nextLine();
		//findWords(inputString);
		
		countWords(inputString);
		sc.close();

	}

}
