package com.java.core.interview;

import java.util.*;


public class StreamMapDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1,2,3,4);
		l.stream().map(e-> e *2).forEach(System.out::println);
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "Hello");
		map.put(3, "BYE");
		map.put(2, "CIAO");
		map.put(4, "Hola");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("\n");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
 