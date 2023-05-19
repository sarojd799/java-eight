package com.java.core.interview.problems;

import java.util.HashMap;

public class DenominationsExample {
	
	public HashMap<String, Integer> hm = new HashMap<String,Integer>();
	
	@SuppressWarnings("rawtypes")
	public HashMap count(Integer amt) {
		if((amt / 10) > 0) {
			hm.put("TEN",(amt / 10));
			return count(amt % 10);
		} else if((amt / 5) > 0) {
			hm.put("FIVE",(amt / 5));
			return count(amt % 5);
		} else if((amt / 2) > 0) {
			hm.put("TWO",(amt / 2));
			return count(amt % 2);
		} else {
			hm.put("ONE",(amt / 1));
			return hm;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DenominationsExample  de = new DenominationsExample();
		System.out.println(de.count(39));
	}

}
