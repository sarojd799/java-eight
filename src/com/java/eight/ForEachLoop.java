package com.java.eight;

import java.util.ArrayList;
import java.util.List;

/*
 
 	Java provides a new method forEach() to iterate the elements. 
 	It is defined in Iterable and Stream interface. It is a default 
 	method defined in the Iterable interface. Collection classes 
 	which extends Iterable interface can use forEach loop to iterate elements.

	This method takes a single parameter which is a functional interface. So, you can pass lambda expression as an argument.
	
	Syntax: default void forEach(Consumer<super T>action)
	
	 Java Stream forEachOrdered() Method:
	 -----------------------------------
	 Along with forEach() method, Java provides one more method forEachOrdered(). 
	 It is used to iterate elements in the order specified by the stream.
	 
	 Syntax:  void forEachOrdered(Consumer<? super T> action)
	 
 * */
public class ForEachLoop {

	public static void main(String[] args) {
		
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Hockey");
		gamesList.add("Tennis");
		gamesList.forEach(game-> System.out.println(game)); // Lambda arrow expression
		gamesList.forEach(System.out::println); // Method reference
		
		
		//stream ordered forEach
		gamesList.stream().forEach(System.out::println);

	}

}
