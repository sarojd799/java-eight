package com.java.core.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {

	public static List<Integer> numList = new ArrayList<Integer>();
	
	public static Object[] flatten(Object[] a) {
		return new Object[]{};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] arr = {1, new Object[] {2, 3}, 4, new Object[] {5, new Object[] {6} } };
		flatten(arr);
	}

}
