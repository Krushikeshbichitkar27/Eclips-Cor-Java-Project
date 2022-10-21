package com.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// adding elements
		map.put(101, "Krushikesh");
		map.put(102, "Pooja");
		map.put(103, "Rahul");
		map.put(104, "Rupesh");
		map.put(105, "Meena");

		System.out.println(map);

		// to iterate convert to set
		Set set1 = map.entrySet();

		Iterator itr = (Iterator) set1.iterator();

		while (itr.hasNext()) {
			// key value separately
			Map.Entry<Integer, String> pair = (Entry<Integer, String>) itr.next();
			System.out.println(pair.getKey() + " " + pair.getValue());

		}
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-");
		// 2nd way
		for (Map.Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getKey() + " " + data.getValue());
		}
	}

}
