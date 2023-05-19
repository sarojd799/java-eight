package com.java.core.collection;

import java.util.HashSet;
import java.util.Set;

class Dummy {
	
	private final String argument;
	
	Dummy(String argument) {
		this.argument = argument;
	}
	
	@Override
	public String toString() {
		return this.argument;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
    public boolean equals(Object o) {
		return o != null && this.hashCode() == o.hashCode();
    }
	
}
public class HashMapTest {
	
	/*
	 * It will insert elements in normal process
	 * If both the objects have same hash code then it will be a hash collision while calculating index
	 * So after that the equality is checked by equals method.
	 * if both the objects are equal then the value will be overridden otherwise another node will be created at the same index.
	 * */

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set m = new HashSet();
        Dummy d1 = new Dummy("Alex");
        Dummy d2 = new Dummy("Jacob");
        Dummy d3 = new Dummy("Alex");
        m.add(d1);
        m.add(d2);
        m.add(d3);
        System.out.println(m);
        
        m.clear();
        String s1 = new String("Matheew");
        String s2 = new String("Matheew");
        String s3 = "Matheew";
        m.add(s1);
        m.add(s2);
        System.out.println(m);
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.hashCode() == s3.hashCode());
        
        /*
         * before hashcode
         [Jacob, Alex, Alex]
		 [Matheew]
         -1789305937
         -1789305937 
         * */
        
	}

}
