package com.Lambda;

public class Test
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//lambda with 1 parameter and  return type
		Myname n1=(name) -> {
			return name;
		};
System.out.println("Hello"+n1.printName("Krushikesh"));
	
	//lambda with 1 parameter and no return  type
	
Myname n2=(name) -> {
		System.out.println("Hello"+name);
		return name;
		
	};
	n2.printName("Raj");
	}
	//brackets can be omitted with single parameter
	Myname n3=(name) -> {
		System.out.println("Hello"+name);
		return name;
		
	};
	n3.printName("Pooja");
	}

