package com.java.core.oops;

class FinalParent {
	public void display() {
		System.out.println("Hello");
	}
}

public class FinalOverriding extends FinalParent {

	/*
	 * Error: Unable to load main class com.java.core.oops.FinalOverriding in module com.jdk8
	java.lang.IncompatibleClassChangeError: class com.java.core.oops.FinalOverriding overrides final method com.java.core.oops.FinalParent.display()V

	 * public  void display() {
		System.out.println("Hi");
	}
	 * if parent contains final then we can't override the method in child.
	 * but if child overrides parent method with final modifier then it is fine.
	 * 
	 * */
	public final void display() {
		System.out.println("Hi");
	}
	
	public static void main(String ...args) {
		FinalOverriding fo = new FinalOverriding();
		fo.display();
	}
}
