package com.java.core.lang;

public class StringPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println("1-"+(s1 == s2)); //false
		
		String s3 = "Hello";
		System.out.println("2-"+(s2==s3)); //false
		
		String s4 = "Hello";
		System.out.println("3-"+(s3==s4)); //true
		
		String s5 = "Hel" + "lo"; //compile time constant
		System.out.println("4-"+(s4==s5)); //true
		
		String s6="Hel";
		String s7="lo";
		String s8 = s6 + s7;
		System.out.println("5-"+(s8==s3)); //false
		
		String s9 ="Hello world";
		final String s10="Hello";
		String s11= s10+ " world"; //compile time constant
		System.out.println("6-"+(s9==s11)); //true
		
		String s12 = new String("Test");
		String s13 = new String("Test"); //same scpa constant will be used.
		String s14 = "Test";
		System.out.println("7-"+(s12.intern() == s13.intern())); //true
		System.out.println("8-"+(s14 == s13.intern())); //true
		
		String s15 = "Saroj";
		String s16 = s15 + "Dash";
		String s17 = "Dash";
		System.out.println(s15.intern());
		System.out.println(s16.intern());
		System.out.println(s17.intern());

	}

}
