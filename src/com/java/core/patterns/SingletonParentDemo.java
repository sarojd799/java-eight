package com.java.core.patterns;

class SingletonParent {

	private static SingletonParent p=null;
	
	private SingletonParent() {}
	
	public static SingletonParent getInstance() {
		if(p == null) {
			p = new SingletonParent();
		}
		return p;
	}
	
	public void print(String message) {
		System.out.println("Message");
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException  {
        throw new CloneNotSupportedException();
    }
}


class SingletonParentDemo {

	//class SingletonParentDemo extends SingletonParent {
	
	/**
	 * While creating a singleton final keyword is not mandatory. private constructor in parent will prevent instantiation in child
	 * 
	 * purpose of singleton
	 * 
	 * 1. limit the number of object instance creation
	 * 2. maintain only 1 scope of reference
	 * 
	 * Forms of singleton creation
	 * 
	 * 1.Early instantiation
	 * 2.Lazy instantiation
	 * 
	 * Steps to create a singleton
	 * 
	 * 1.Declaring all constructors of the class to be private.
	 * 2.Providing a static method that returns a reference to the instance
	 * 3.The instance is stored as a private static variable.
	 * 
	 */

   	public static void main(String ...args) {
   		//SingletonParentDemo d = new SingletonParentDemo();
   		//SingletonParent p= (SingletonParent)d;
   		//p.print("Voila"); // Implicit super constructor SingletonParent() is not visible for default constructor
   		System.out.println("Hello");
   		//d.print("From child" + (d instanceof SingletonParent));
   		
   		SingletonParent s = SingletonParent.getInstance();
   	}
}
