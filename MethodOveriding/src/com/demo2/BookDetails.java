package com.demo2;

public class BookDetails {
	
	static void display(Library l) 
	{
	System.out.println(l);	
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Library l1= new Library("Wings of Fires",599.9,new Author("A.P.J Abdul Kalam", 15.1969," aeronautical engineering"));
     
     System.out.println("Book Deatails :");
     
     display(l1);
	}

}
