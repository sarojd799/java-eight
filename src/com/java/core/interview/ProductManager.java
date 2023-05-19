package com.java.core.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductManager {
	int res = 0;
	
	public void manage() {
		System.out.println("executing");
		Product p1 = new Product(1,"a",11,440,"PERISHABLE");
		Product p2 = new Product(2,"b",19,445,"");
		Product p3 = new Product(3,"c",12,456,"PERISHABLE");
		Product p4 = new Product(4,"d",17,478,"");
		
		List<Product> l = (List<Product>) List.of(p1, p2,p3,p4);
	
		l.stream().filter(prod-> prod.getCategory().equals("PERISHABLE")).forEach(prod-> {
			res +=   prod.getWeight();
		});
		System.out.println(res+ " -next to print reduce function");
		
		
		//reduce function
	   l.stream().filter(prod-> {
		   return prod.getCategory().equals("PERISHABLE");		   
	   }).mapToInt(prod-> prod.getWeight())
	   .reduce((a,b)-> a + b).ifPresent(System.out::println);
	   
	   //simple reduce example
	   System.out.println("executing last reduce");
	   List.of(1,2,3).stream().reduce((a,b)->{
		   return a + b;
       });
	   
	   //printing intermediate values in reduce function
	   System.out.println("now reduce with initial value");
	   List.of(1,2,3).stream().reduce(5,(a,b)->{
		   System.out.println(a+"-"+b);
		   return a + b;
       });	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductManager pm =  new ProductManager();
		pm.manage();
	}

}
