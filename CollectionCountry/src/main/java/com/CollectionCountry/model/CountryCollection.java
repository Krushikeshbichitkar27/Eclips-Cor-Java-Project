package com.CollectionCountry.model;

//importing package
import java.util.HashMap;
import java.util.Scanner;

//declaring class
public class CountryCollection {

	// calling main method
	public static void main(String[] args) {
		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating countryInformation object
		Country cinfo = new Country();

		// TODO Auto-generated method stub
		HashMap<String, Country> ccode = new HashMap<String, Country>();

		// adding country
		ccode.put("India", new Country("+91", "India", "New Delhi"));
		ccode.put("UK", new Country("+44", "UK", "London"));
		ccode.put("South Korea", new Country("+82", "South Korea", "Seoul"));
		ccode.put("France", new Country("+3", "France", "Paris"));
		ccode.put("India", new Country("+91", "India", "New Delhi"));

		System.out.println("Country Portal :");
		System.out.println("=============================");
		System.out.println("Enter Country :");
		String country = sc.nextLine();

		// check :country is present in the map
		boolean status = ccode.containsKey(country);

		// displaying the information
		if (status) {
			System.out.println("============Country Information=================");
			cinfo = ccode.get(country);
			System.out.println(cinfo);

		} else {
			System.out.println("=============Country Not Found================");
		}
		// traversing
		// for (Map.Entry<String, Country> code : ccode.entrySet()) {

		// e}
		sc.close();
	}

}
