package com.java.core.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StreamAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[(S|s)([A-Z]|(a-z)]",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("Saroj");
		System.out.println(m.find());
		
		System.out.println("Saroj".indexOf("S") == 0);
	}

}
