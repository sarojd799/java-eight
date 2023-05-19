package com.java.core.oops;

class OverloadingStaticChildParent {
	public static void print(String message) {
        System.out.println(message);
	}
	
	public static void log() {
        System.out.println("logging in parent");
	}
}
public class OverloadingStaticInChild extends OverloadingStaticChildParent {
	
	public static void print(String message, String person) {
		if(person != null && person.trim().length() != 0) {
			System.out.println(message+" "+person);
		}
	}
	
	public static void log() {
        System.out.println("logging in child");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingStaticInChild d = new OverloadingStaticInChild();
		//	d.print("Bien venido a mexico");  //valid
		//	d.print("bien venido a mexico", "senor"); //valid
		d.log(); //child
		
		OverloadingStaticChildParent oscp = new OverloadingStaticInChild();
		oscp.log(); //parent
		oscp.print("Only available method");
		
		OverloadingStaticChildParent oscp1 = new OverloadingStaticChildParent();
		oscp1.log(); //parent
		oscp1.print("Only avialble method");

	}

}
