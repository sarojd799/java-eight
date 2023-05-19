package com.java.eight;

/*
 * Java provides a facility to create default methods inside the interface. 
 * Methods which are defined inside the interface and tagged with default are known as default methods. 
 * These methods are non-abstract methods.
 * Default methods can be overridden in the implementation class
 * */

interface Sayable {

	default void say() { // Default method
		System.out.println("Hello, this is default method");
	}

	static void sayLouder(String msg) { // static method
		System.out.println(msg);
	}

	void sayMore(String msg); // Abstract method
}

public class DefaultMethodsExample implements Sayable {

	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {

		DefaultMethodsExample dm = new DefaultMethodsExample();
		dm.say();
		dm.sayMore("Mera yeshu yeshu");

		// Interfaces can also have implementations inside static methods
		Sayable.sayLouder("Ram Ram");

		/*
		 * Abstract Class vs Java 8 Interface: ---------------------------------- After
		 * having default and static methods inside the interface, we think about the
		 * need of abstract class in Java. An interface and an abstract class is almost
		 * similar except that you can create constructor in the abstract class whereas
		 * you can't do this in interface.
		 * 
		 */

	}

}
