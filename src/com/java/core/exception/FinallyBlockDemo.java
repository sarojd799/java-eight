package com.java.core.exception;

public class FinallyBlockDemo {
	

	public static void main(String ...args) {
		/*
		 Finally doesn't run in this case
		try {
			System.out.println("Hello");
			System.exit(0);
		} finally {
			System.out.println("Finally");
		}
		
		*/
		
		/*
		 * Finally runs in this case
		 try {
		 
			System.out.println("Hello");
			return; 
		} finally {
			System.out.println("Finally");
		}
		*/
	}
}
