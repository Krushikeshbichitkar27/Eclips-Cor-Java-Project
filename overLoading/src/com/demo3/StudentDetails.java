package com.demo3;

public class StudentDetails
{
	
	static void display(Student s)
	{
		System.out.println("Student ID :"+s.getId());
		System.out.println("Student Name :"+s.getName());
		System.out.println("Student Address :"+s.getAddress());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		Student s1= new Student( 21," Krushikesh",new Address("G 127","Navi mumbai",400708,"Maharashtra","India"));
		System.out.println("Deatails are :");

		display(s1);
	}

}
