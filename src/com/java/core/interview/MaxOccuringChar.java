package com.java.core.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.stream.Collectors;


public class MaxOccuringChar {

	private static String input = "abcabadacbaxaba";

	private static Map<String, Integer> map = new HashMap<String, Integer>();

	public static Map<String, Integer> max = new HashMap<String, Integer>();
	
	public static Map<String, Integer> secondMax = new HashMap<String, Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//count
		Arrays.asList(input.split("")).forEach(str -> {
			if (map.get(str) != null) {
				map.put(str, map.get(str).intValue() + 1);
			} else {
				map.put(str, 1);
			}
		});
		
		System.out.println(map);
		
		//max
		map.entrySet().forEach(e-> {
			System.out.println("e"+ e.getKey());
			System.out.println("val"+ max.get(e.getKey()));
			if(max.keySet().size() != 0 && max.get(e.getKey()) != null && max.get(e.getKey()) < e.getValue()) {
				max.put(e.getKey(), e.getValue().intValue());
			} else {
				max.put(e.getKey(), 0);
			}
		});
		
		map.entrySet().forEach(e-> {
			if(max.keySet().size() == 0 || 
					max.get(e.getKey()) < e.getValue() &&
					!e.getKey().equals(max.keySet().toArray()[0])) {
				secondMax.put(e.getKey(), e.getValue().intValue());
			} 
		});
		
		System.out.println(max);
		System.out.println(secondMax);
		
		/*map.entrySet().forEach(e-> {
			if(secondMax.keySet().size() == 0 || 
					max.get(e.getKey()) < e.getValue() && 
					e.getKey().equals())) {
				max.put(e.getKey(), e.getValue());
			} 
		});*/
		
		
		
		
		
		//System.out.println(maxStr+ " repeated "+ maxVal+ " times");

	}

}
