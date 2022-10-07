package com.example;

public class TestFinally
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			String s=null;
			System.out.println(s.length());
		}finally {
			System.exit(0);// use for exit : it will come out from the program
		}

	}

}
