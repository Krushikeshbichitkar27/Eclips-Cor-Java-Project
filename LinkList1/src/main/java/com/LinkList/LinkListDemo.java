package com.LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> linkList = new LinkedList<String>();
		linkList.add("Amplaibe");
		linkList.add("Mango");
		linkList.add("Dairy Milk");
		linkList.add("KitKat");

		System.out.println(linkList);

		// adding at specific position
		linkList.add(1, "Amul");
		System.out.println(linkList);

		List<String> linkList2 = new LinkedList<String>();
		linkList.add("Lindt");
		linkList.add("Ferrero Rocher");

		linkList.addAll(linkList2);
		System.out.println(linkList2);

		linkList.removeAll(linkList2);
		System.out.println(linkList);

		// to print the list in reverse order
		Iterator<String> i = new LinkedList.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
