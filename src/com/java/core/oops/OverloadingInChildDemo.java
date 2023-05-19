package com.java.core.oops;

class OverloadingChildParent {
	public void print(String message) {
        System.out.println(message);
	}
}
public class OverloadingInChildDemo extends OverloadingChildParent {
	
	public void print(String message, String person) {
		if(person != null && person.trim().length() != 0) {
			System.out.println(message+" "+person);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingInChildDemo d = new OverloadingInChildDemo();
		d.print("Bien venido a mexico");
		d.print("bien venido a mexico", "senor");
		
		OverloadingChildParent ocp = new OverloadingInChildDemo();
		ocp.print("parent");//only available method

	}

}
