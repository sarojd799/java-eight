package com.java.core.annotations;


interface Person {
	void walk();
}

/*
 If we are not overriding the parent function appropitately then we will get compile time error
 
 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method walk(String) of type OverrideDemo must override or implement a supertype method
		
 * */
public class OverrideDemo implements Person {
	
	@Override
	public void walk() {
		System.out.println("Hey i am walking.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideDemo d = new OverrideDemo();
		d.walk();

	}

}
