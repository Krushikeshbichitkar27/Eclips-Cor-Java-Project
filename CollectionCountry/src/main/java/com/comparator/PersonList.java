package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> lop = new ArrayList<Person>();
		lop.add(new Person(12, "Raj", 26));
		lop.add(new Person(16, "Tina", 23));
		lop.add(new Person(21, "Krushikesh", 24));
		lop.add(new Person(23, "Abdul", 20));
		lop.add(new Person(10, "Shree", 26));

		System.out.println("=========Age Sort==========");
		Collections.sort(lop, new AgeComparator());

		for (Person p : lop) {
			System.out.println(p);
		}

		System.out.println("=========Name Sort==========");
		Collections.sort(lop, new NameComparator());

		for (Person p : lop) {
			System.out.println(p);
		}

	}

}
