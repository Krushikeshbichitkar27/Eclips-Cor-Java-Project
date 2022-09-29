package com.access;

public class Demo 
{
public static void main(String[] args)
{
	AccessDemo a2=new AccessDemo();
	a2.num=8;
	//a2.name="ABC"; private not accessible
	
	a2.course="MBA";
}
}
