package com.java.core.interview;

public class StringReverse {
	
	public static String reverse = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "SAROJDASH";
		String[] chars = name.split("");
	
		for(int i= chars.length - 1; i >= 0; i--) {
			reverse += chars[i];
		}
		System.out.println(reverse);

	}

}
