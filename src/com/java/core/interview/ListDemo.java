package com.java.core.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(23);
		al.add(255);
		System.out.println(al.indexOf(255));
		
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(46);
		ll.add(23);
		ll.offer(465);
		ll.push(67);
		
		al.forEach(System.out::println);
		ll.forEach(System.out::println);
		
		ll.indexOf(465);
		*/
		
		
		
		ArrayList<Character> als = new ArrayList<Character>();
		
		for(int i = 65; i< 91; i++) {
			char c = (char)i;
			Character ch = Character.valueOf(c);
			als.add(ch);
		}
		
		List l3 = List.of('A','E','I','O','U');
		als.stream().filter(item-> !l3.contains(item)).forEach(System.out::println);
		

	}

}
