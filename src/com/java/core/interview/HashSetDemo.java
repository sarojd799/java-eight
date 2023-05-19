package com.java.core.interview;

import java.util.HashSet;


class EmployeeDemo {
	
	private String name;
	EmployeeDemo(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	@Override
	public int hashCode() {
		return 33;
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hi");
		String s2 = new String("Hi");
		HashSet h = new HashSet();
		h.add(s1);
		h.add(s2);
		h.add(new EmployeeDemo("Rajesh"));
		h.add(new EmployeeDemo("Rajesh"));
		System.out.println(h);

	}

}
