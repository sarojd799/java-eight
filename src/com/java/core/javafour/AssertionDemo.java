package com.java.core.javafour;

import java.util.Scanner;


/**
 * Assertion is a statement in java. It can be used to test your assumptions about the program
 * While executing assertion, it is believed to be true. If it fails, JVM will throw an error named java.lang.AssertionError
 * It is mainly used for testing purpose
 * 
 * syntax:
 * assert expression;  
 * assert expression1 : expression2;  
 * 
 * assertions are disabled by default , to enable
 * Compile it by: javac AssertionExample.java
 * Run it by: java -ea AssertionExample
 */
public class AssertionDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );  
		System.out.print("Enter ur age ");  
		int value = scanner.nextInt();  
		assert value>=18:" Not valid";  
		  
		System.out.println("value is "+value);  

	}

}
