package com.java.core.patterns;


/*
 * Factory pattern
 * It is a creational design pattern that talks about the creation of an object
 * In this pattern there is an interface or abstract class and has many concrete implemention class
 * Factory class decides which impl class to instantiate dynamically and the logic is hidden from the client
 * 
 * 
 * */


interface Shape {
	void draw();
}

class Triangle implements Shape {
	public void draw() {
		System.out.println("I am drawing Triangle");
	}
}

class Square implements Shape {
	public void draw() {
		System.out.println("I am drawing Square");
	}
}

class Circle implements Shape {
	public void draw() {
		System.out.println("I am drawing Circle");
	}
}

class ShapeFactory {
	public Shape getShape(String type) {
		if(type == "Circle") {
			return new Circle();
		}else if(type == "Triangle") {
			return new Triangle();
		}else if(type == "Square") {
			return new Square();
		}
		return null;
	}
}


public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape s = factory.getShape("Circle");
		s.draw();

	}

}
