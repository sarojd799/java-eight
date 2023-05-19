package com.java.core.exception;

import java.io.IOException;

public class NoException {

		
	public static void main(String ...args) throws IOException {
	//try {
		    //System.out.println("Hello");java.lang.Error: Unresolved compilation problem: Unreachable catch block for IOException. This exception is never thrown from the try statement body
		//} catch(IOException e) {
			//System.out.println(e.getMessage());
		//}
		
		/*
		 * We can write normal code that will not throw exception and throw checked exception. in case of try catch it will throw error.
		 * */
		System.out.println("Hello");
	}
}
