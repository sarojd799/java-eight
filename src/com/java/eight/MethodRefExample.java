package com.java.eight;

/*
 
 	There are following types of method references in java:
	
	1. Reference to a static method.
	2. Reference to an instance method.
	3. Reference to a constructor.
	
 * */

interface Greet {
	void say();
}

class Action {
	void performAction() {
		System.out.println("Haiyaaah");
	}
}

class See {
	See() {
		System.out.println("Hello from See constructor");
	}
}

public class MethodRefExample {

	public static void sayHello() {
		System.out.println("Hello from static method");
	}

	public static void main(String[] args) {

		/*
		 * Static method referencing to say method of Greet interface Note: If there are
		 * multiple interface abstract methods then it will not work and will throw
		 * error
		 */
		Greet greet = MethodRefExample::sayHello;
		greet.say();

		/*
		 * Note: same multiple abstract methods will lead to compile errors. It is
		 * called reference to instance method
		 */
		Greet greet1 = new Action()::performAction;
		greet1.say();
		
		
		/*
		 * Note: Multiple abstract methods leads to compile error as well
		 * It is called reference to class constructor 
		 */
		Greet greet2 = See::new;
		greet2.say();
		
		

	}

}
