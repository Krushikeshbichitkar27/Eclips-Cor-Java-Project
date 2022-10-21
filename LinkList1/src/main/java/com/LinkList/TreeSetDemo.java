package com.LinkList;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(12);
		set.add(27);
		set.add(03);
		set.add(98); // ignores duplicate value
		// set.add(null); :exception

		System.out.println(set);

		// highest and lowest : retrieve and remove
		System.out.println("Lowest Value :" + set.pollFirst());
		System.out.println("Highest Value :" + set.pollLast());

		System.out.println(set);

		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Amul");
		set1.add("Mango");
		set1.add("Dairy Milk");
		set1.add("KitKat");

		System.out.println("Original set :" + set1);

		System.out.println("Reverse set :" + set1.descendingSet());

		// element smaller than string
		System.out.println("Head set :" + set1.headSet("Dairy Milk", true));
		System.out.println("Head set :" + set1.tailSet("Dairy Milk", true));

	}

}
