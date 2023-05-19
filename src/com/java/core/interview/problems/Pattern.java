package com.java.core.interview.problems;

import java.util.Arrays;

public class Pattern {
	public static int count = 1;
	
	
	public static void printPattern(int val) {
		count = 1;
		for(int i=0; i < val; i++) {
			 for(int j=0; j <= i+ 1; j++) {
				 System.out.print(count);
				 if(count == val) {
					 return;
				 }
				 count += 1;
			 }
			 System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printPattern(15);
		
		String str = "I am I a Full a Stack Stack Full developer";
		
		Arrays.asList(str.split(" ")).stream().map(s-> s.toUpperCase()).distinct().forEach(System.out::println);
	}

}
