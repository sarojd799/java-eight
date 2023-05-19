package com.java.core.oops;


class Parent {
	private Parent() {
		
	}
	public void  print(String message) {
		System.out.println(message);
	}
}


public class PrivateConstructorInheritanceDemo {
//public class PrivateConstructorInheritanceDemo extends Parent{
   private PrivateConstructorInheritanceDemo() {
	   
   }
   public static void main(String ...args) {
	   System.out.println("Hello");
	   PrivateConstructorInheritanceDemo instance = new PrivateConstructorInheritanceDemo();
	   /*
	    * Inheritance is possible but we can't create instance of either child or parent
	    * 
	    * Error:
	    * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	    * Implicit super constructor Parent() is not visible. Must explicitly invoke another constructor
	    */
   }
}
