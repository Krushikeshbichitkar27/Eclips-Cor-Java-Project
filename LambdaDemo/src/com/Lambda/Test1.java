package com.Lambda;

public class Test1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//lambda with multiple parameter
		Add a1=(a,b)->{
			System.out.println((a+b));
		};
		a1.computeSum(9,7);
		
		/////
		Add a2=(int a,int b)->{
			System.out.println((a+b));
		};
		a2.computeSum(5, 2);

		//with return type
		Add2 a3=(a,b)->(a+b); //in single return statement body
		System.out.println("With body :"+a3.computeSum(5,8));
		
		
		
	}

}
