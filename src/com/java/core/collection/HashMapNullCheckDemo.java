package com.java.core.collection;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapNullCheckDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String ...args) {
		HashSet h = new HashSet();
		h.add(null);
		h.add(null);
		System.out.println("hashset-"+h);
		
		TreeSet t = new TreeSet();
		//t.add("test");
		//t.add(null); in 1.7 it was allowing only one null in an empty treeset. but 1.7 onwards i.e > 1.7 throws NPE
		//t.add(null);
		System.out.println("treeset-"+t);
		
		TreeMap tm = new TreeMap();
		//tm.put(null, 1);
		//tm.put(null, 2);
		System.out.println(tm);
	}
}
