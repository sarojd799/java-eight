package com.java.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Java provides a new additional package in Java 8 called java.util.stream. 
 * This package consists of classes, interfaces and enum to allows functional-style operations on the elements. 
 * You can use stream by importing java.util.stream package.
 * 
 * Notes:
 * 
 * 1.Stream does not store elements. It simply conveys elements from a source such as a data structure, 
 *   an array, or an I/O channel, through a pipeline of computational operations.
 * 
 * 2.Stream is functional in nature. Operations performed on a stream does not modify it's source. 
 *  For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, 
 *  rather than removing elements from the source collection.
 * 
 * 3.Stream is lazy and evaluates code only when required.
 * 
 * 4.The elements of a stream are only visited once during the life of a stream. Like an Iterator, 
 *  a new stream must be generated to revisit the same elements of the source.
 *  
 *  @link: https://www.javatpoint.com/java-8-stream
 *  
 *  
 *  Java Streams Terminal Operations:-
 *  --------------------------------
 *  1. Java streams should be ended with a terminal operation.
 *  2. A terminal operator is an operator which returns another stream object in return type.
 * 
 * */
public class StreamAPIExample {

	public static void main(String[] args) {

		Arrays.asList(11, 2, 333, 23, 222, 1, 45, 22, 17).stream().filter(num -> num % 2 == 0).map(num -> num * 2)
				.forEach(System.out::println);

		// Matches based on Object.equals
		Arrays.asList(1, 2, 3, 2, 11, 23, 2, 222).stream().distinct().forEach(System.out::println);
		Integer max = Arrays.asList(1, 2, 3, 2, 11, 23, 2, 222).stream().max((a, b) -> a > b ? 1 : -1).get();
		Integer min = Arrays.asList(1, 2, 3, 2, 11, 23, 2, 222).stream().min((a, b) -> a > b ? 1 : -1).get();

		System.out.println("max is " + max + " min is " + min); // min and max

		System.out.println("count is " + Arrays.asList(1, 2, 3).stream().count()); // Count
		
		System.out.println("sum is " + Arrays.asList(1, 2, 3).stream().mapToInt(a->a).sum());
		
		System.out.println("average is " + Arrays.asList(1, 2, 3).stream().mapToInt(a->a).average().getAsDouble());
		
		
		
		
		
		
		
		

		System.out.println("any divided by 3 " + Arrays.asList(2, 4, 6).stream().anyMatch(num -> num % 3 == 0));

		System.out.println("all divided by 3 " + Arrays.asList(2, 4, 8).stream().allMatch(num -> num % 3 == 0));

		System.out.println("all divided by 2 " + Arrays.asList(2, 4, 8).stream().allMatch(num -> num % 2 == 0));

		/*
		 * 
		 * findAny() V/s findFirst() :
		 * 
		 * The findAny() method returns any element from a Stream but there might be a
		 * case where we require the first element of a filtered stream to be fetched.
		 * When the stream being worked on has a defined encounter order(the order in
		 * which the elements of a stream are processed), then findFirst() is useful
		 * which returns the first element in a Stream.
		 */

		System.out
				.println("find any " + Arrays.asList(2, 3, 4, 8).stream().filter(num -> num % 2 == 0).findAny().get());
		System.out.println(
				"find first " + Arrays.asList(2, 3, 4, 8).stream().filter(num -> num % 2 == 0).findFirst().get());

		// Stream.of, sorted
		Stream.of(11, 2, 333, 44).sorted().forEach(System.out::println);

		// find out stream peek vs map function

		// reduce
		Stream.of(1, 2, 3, 4, 5).reduce((a, b) -> a + b).ifPresent(System.out::println);

	}

}
