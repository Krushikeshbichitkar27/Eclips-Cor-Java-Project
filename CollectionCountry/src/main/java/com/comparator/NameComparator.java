package com.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}

}
