package com.LinkList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> linkList = new LinkedList<String>();
		linkList.add("Bournville");
		linkList.add("5 Star");
		linkList.add("Dairy Milk");
		linkList.add("KitKat");
		linkList.add("Bournville");

		// remove all the duplicate value from the list
		HashSet<String> set = new HashSet<String>(linkList);
		System.out.println(set);

		set.add(null);
		System.out.println(set);

		// HashSet<String> set = new HashSet<String>();
		// set.add(1);
		// set.add(2);
		// set.add(3);
		// set.add(4); // ignores duplicate value

		// System.out.println(set);

	}

}
