package com.java.core.oops;



class SimpleOverridingParent {
	public void greet() {
		System.out.println("Greeting from parent");
	}
}
public class SimpleOverriding extends SimpleOverridingParent {
	
	public void greet() {
		System.out.println("Greeting from child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleOverriding so = new SimpleOverriding(); //child reference holds child instance
		so.greet(); //Greeting from child
		
		SimpleOverridingParent sop = new SimpleOverriding(); //parent holds child instance
		sop.greet(); //Greeting from child
		
		SimpleOverridingParent sop1 = new SimpleOverridingParent(); //only parent reference and parent instance
		sop1.greet();//Greeting from parent
		
		
		/*
		 SimpleOverriding so1 = (SimpleOverriding)new SimpleOverridingParent();
		so1.greet();
		 
		 
		 Exception in thread "main" java.lang.ClassCastException: class com.java.core.oops.SimpleOverridingParent 
		 cannot be cast to class com.java.core.oops.SimpleOverriding (com.java.core.oops.SimpleOverridingParent 
		 and com.java.core.oops.SimpleOverriding are in module com.jdk8 of loader 'app')
	     at com.jdk8/com.java.core.oops.SimpleOverriding.main(SimpleOverriding.java:25)
		 */
		

	}

}
