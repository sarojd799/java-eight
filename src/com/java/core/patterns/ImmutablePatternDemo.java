package com.java.core.patterns;

/*

1.The class must be declared as final so that child classes can’t be created.
2.Data members must be private so that direct access is not allowed.
3.Data members must be final so that we can’t change the value of it after object creation.
4.parameterized constructor should initialize the fields so that data members can’t be modified with an object reference.
5.Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)
  
  */
final class ImmutablePattern {
	
	private final Integer n;
	
	public ImmutablePattern(Integer n) {
		this.n = n;
	}
	
	public Integer getNumber() {
		return this.n;
	}
}
public class ImmutablePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutablePattern ip = new ImmutablePattern(90);
		System.out.println(ip.getNumber());
	}

}
