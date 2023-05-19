package com.java.core.interview;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test {
	
	

	public static void main(String ...args) {
		
		Map<String, Integer> m= new HashMap<String, Integer>();
		String str = "this this is is done by created by saroj";
		
		List<String> l = (List)Arrays.asList(str.split(" "));
		
		l.stream().forEach(item->{
			if(m.containsKey(item)) {
				m.put(item,m.get(item) + 1);
			} else {
				m.put(item, 1);
			}
		});
		
		System.out.println(m);
		
	}
}
