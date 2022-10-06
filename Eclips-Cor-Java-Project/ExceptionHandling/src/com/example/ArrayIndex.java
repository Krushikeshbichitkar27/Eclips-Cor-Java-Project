package com.example;

import java.util.Scanner;
//declaring class
public class ArrayIndex 
{
    //calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
        try 
        {
        	int ar[] = new int[3];
        	 System.out.println("Enter Number :");
            for (int i = 0; i <= 4; i++)
            {
            	ar[i]=sc.nextInt();
            }
            
            String s=null;
            System.out.println(s.length());
            
        }catch (NullPointerException n) 
        {
            System.out.println(n);
        }
        catch (Exception e) 
            {
            System.out.println("Array Index OutOfBound Exception" +e);
            }
        
	}
}


