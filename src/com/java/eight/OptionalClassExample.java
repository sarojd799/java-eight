package com.java.eight;

import java.util.Optional;

/*
 * 
   Java introduced a new class Optional in jdk8. 
   It is a public final class and used to deal with NullPointerException in Java application. 
   You must import java.util package to use this class. It provides methods which are used 
   to check the presence of value for particular variable.
   
   	Methods:
     
     1.public static <T> Optional<T> empty() 
     ---------------------------------------
     It returns an empty Optional object. No value is present for this Optional.
     
     2.public static <T> Optional<T> of(T value)
     ------------------------------------------
     It returns an Optional with the specified present non-null value.
     
     3.public static <T> Optional<T> ofNullable(T value)
     
     4.public T get()
     
     5.public boolean isPresent()
     
     6.public void ifPresent(Consumer<? super T> consumer)
     
     7.public Optional<T> filter(Predicate<? super T> predicate)
     
     8.public <U> Optional<U> map(Function<? super T,? extends U> mapper)
     
     9.public <U> Optional<U> flatMap(Function<? super T,Optional<U> mapper)
     
     10.public T orElse(T other)
     
     11.public T orElseGet(Supplier<? extends T> other)
     
     12.public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X extends Throwable
     
     13.public boolean equals(Object obj)
     
     14.public int hashCode()
     
     15.public String toString() 
     
     
 * */

public class OptionalClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[10];
		Optional<String> data = Optional.ofNullable(str[5]);
		if (data.isPresent()) System.out.print(str[5].toLowerCase());
		else System.out.println("string value is not present");
		
		data.ifPresent(System.out::println);
		
		
		str[2] = "Some value";
		System.out.println("value present in 5th index: "+ data.orElse("EMPTY"));	
		System.out.println("value present in 5th index: "+ Optional.ofNullable(str[2]).orElse("EMPTY"));
		
		
		// It returns an empty instance of Optional class   
        Optional<String> empty = Optional.empty();  
        System.out.println(empty); 
        
        
        // filter executes when the optional value is non empty or not null
        Optional.ofNullable(str[2]).filter(val-> {
        	System.out.println("from filter-"+val);
        	return true;
        }).map(res-> {
        	System.out.println("from map"+res);
        	return res;
        }).orElse("Hello uganda");
		

		

	}

}
