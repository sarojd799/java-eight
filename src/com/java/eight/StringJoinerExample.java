package com.java.eight;

import java.util.StringJoiner;

/*
 
  	Java added a new final class StringJoiner in java.util package. 
  	It is used to construct a sequence of characters separated by a delimiter. 
  	Now, you can create string by passing delimiters like comma(,), hyphen(-) etc. 
  	You can also pass prefix and suffix to the char sequence.
  	
  	Constructor:
  	
  	1.Public StringJoiner(CharSequence delimiter)
  	2.Public StringJoiner(CharSequence delimiter,CharSequence prefix,CharSequence suffix)
  	
  	Methods:
  	
  	1.Public StringJoiner add(CharSequence newElement)
  	2.Public StringJoiner merge(StringJoiner other)
  	3.Public int length()
  	4.Public StringJoiner setEmptyValue(CharSequence emptyValue)
  	
 */
public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner sj = new StringJoiner("-","[","]");
		sj.add("Pneumono");
		sj.add("ultra");
		sj.add("Microscopic");
		sj.add("silico");
		sj.add("volcano");
		sj.add("coniosis");
		System.out.println(sj);
		
		StringJoiner sj1 = new StringJoiner(",","[","]");
		sj1.add("Tekken");
		sj1.add("FiFA-17");
		
		StringJoiner sj2 = sj.merge(sj1);
		
		// Prefix and suffix after merge is depended on whose merge method is called.
		System.out.println("Joined Items "+sj2);
		System.out.println("Length is "+sj2.length());
		
		StringJoiner joinNames = new StringJoiner(",");
		System.out.println("joinNames: "+ joinNames);
		
		joinNames.setEmptyValue("Empty value");
		System.out.println("joinNames: "+ joinNames);
		System.out.println("joinNames length: "+ joinNames.length());
		
		//Use toString to convert string joiner to string and apply string methods on it
		System.out.println("string methods :"+ joinNames.toString().concat("-Hello"));

	}

}
