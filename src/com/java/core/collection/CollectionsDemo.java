package com.java.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("rawtypes")
class NumComparator implements Comparator {
	public int compare(Object a, Object b) {
	    Integer i1 = (Integer)a;
	    Integer i2 =(Integer)b;
	    return i1.compareTo(i2);
	}
}

public class CollectionsDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0; i< 10; i ++) {
			l.add(i+1);
		}
		Collections.shuffle(l);
		System.out.println(l);
		
		ArrayList l1 = new ArrayList();
		//l1.add(null);
		l1.add(true);
		l1.add("Hello");
		
		Set<Integer> s = new TreeSet<Integer>(l);
		s.forEach(System.out::println);
		
		/*
		 *  java.lang.ClassCastException: if we are passing any collection that is not homogeneous.
		 *  java.lang.NullPointerException: if the collection that we are passing has null in it.
		 * */
		//Set<Integer> s1 = new TreeSet<Integer>(l1);
		//s1.forEach(System.out::println);
		
		/*
		List l2 = List.of(1,2,3);
		l2.add(4);//java.lang.UnsupportedOperationException (because we are trying to add to unmodifiable list)
		l2.forEach(System.out::println);
		*/
		
		/*
		List l2 = List.of(1,2,3);
		l2.add(0, 4);//java.lang.UnsupportedOperationException (because we are trying to add to unmodifiable list)
		l2.forEach(System.out::println);
		*/
		
		/*
		List l2 = List.of(1,2,3);
		l2.set(0, 9);//java.lang.UnsupportedOperationException (because we are trying to update element of unmodifiable list)
		l2.forEach(System.out::println);
		*/
		
		
		//To get the unmodifiable version of the collection
		//Collections.unmodifiableList(null)
		//Collections.unmodifiableMap(null)
		//Collections.unmodifiableSet(null)
		
		//To get the synchronized version of the collection
		//Collections.synchronizedCollection(null); //Synchronized collection
		//Collections.synchronizedList(null);
		//Collections.synchronizedMap(null);
		//Collections.synchronizedSet(null);
		
		
		
		

	}

}
