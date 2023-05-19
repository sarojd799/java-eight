package com.java.eight;

/**
    Lambda expression is a new and important feature of Java which was included in Java SE 8. 
    It provides a clear and concise way to represent one method interface using an expression. 
    It is very useful in collection library. It helps to iterate, filter and extract data from collection.
    
    Java lambda expression is treated as a function, so compiler does not create .class file. 
 */

@FunctionalInterface
interface Drawable {
	void draw();
}
public class LambdaExample {

	public static void main(String ...args) {
		Drawable d1 = ()-> {
			System.out.println("I am drawing");
		};
		d1.draw();
	}
}
