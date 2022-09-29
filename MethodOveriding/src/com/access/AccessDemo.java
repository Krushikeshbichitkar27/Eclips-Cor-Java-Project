package com.access;

public class AccessDemo
{
public int num;
protected String course;

public static void main(String[] args)
{
	AccessDemo a=new AccessDemo();
	a.num=7;  //public are accessible within the class,outside 
	System.out.println(a.num);
	
}
}
