package com.java.core.interview;

import java.util.ArrayList;
import java.util.List;

public class FibonacciExample {
	
	public static List<Integer> numList = new ArrayList<Integer>();
	
	
	//0,1,1,2,3,5,8
	public static void printSeries(int limit) {	
		numList.add(0);
		numList.add(1);
		while(numList.size() < 10) {
			int last = numList.get(numList.size() -1);
			int secLast = numList.get(numList.size() -2);
			numList.add(last+secLast);
		}
		System.out.println(numList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        printSeries(10);
	}

}
