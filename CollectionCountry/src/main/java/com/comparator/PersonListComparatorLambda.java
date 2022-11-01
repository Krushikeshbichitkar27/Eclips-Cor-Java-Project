package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonListComparatorLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> lop = new ArrayList<Person>();
		lop.add(new Person(12, "Raj", 26));
		lop.add(new Person(16, "Tina", 23));
		lop.add(new Person(21, "Krushikesh", 24));
		lop.add(new Person(23, "Abdul", 20));
		lop.add(new Person(10, "Shree", 26));

		// sorting using AIC
		System.out.println("============ Using AIC =============");
		Comparator<Person> com = new Comparator<Person>() {

			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1.getName().compareTo(p2.getName());
			}

		};

		Collections.sort(lop, com);

		for (Person p : lop) {
			System.out.println(p);
		}

		System.out.println("============= Using Lambda ==============");
		List<Person> lop1 = new ArrayList<Person>();
		lop1.add(new Person(12, "Raj", 26));
		lop1.add(new Person(16, "Tina", 23));
		lop1.add(new Person(21, "Krushikesh", 24));
		lop1.add(new Person(23, "Abdul", 20));
		lop1.add(new Person(10, "Shree", 26));

		Collections.sort(lop1, (Person p1, Person p2) -> {
			return p1.getName().compareTo(p2.getName());
		});

		lop1.forEach((Person) -> System.out.println(Person));

	}

}
