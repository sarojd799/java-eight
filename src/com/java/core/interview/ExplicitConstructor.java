package com.java.core.interview;


class SampleParent {
	
	public void print() {
		
	}
	
	SampleParent() {}
}
public class ExplicitConstructor extends SampleParent {

	ExplicitConstructor() {
		//no super call is required. it will be implicitly called
	}
	
    public void print() {
	  System.out.println("Printing child");	
	}
    
    public void log(int i) {
    	System.out.println("Int method");
    }
    
    public void log(char c) {
    	System.out.println("Char method");
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExplicitConstructor ec= new ExplicitConstructor();
		ec.print();
		ec.log('1'); //strict type checking
	}

}
