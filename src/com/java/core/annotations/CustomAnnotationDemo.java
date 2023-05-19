package com.java.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {
	String name() default "Alex";
}

public class CustomAnnotationDemo {

	@Test(name="main is my name, run is my work")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  Applicable in-case we are using class level annotations. anyway we will need help of reflection api to get declared annotations
		  Test[] tests = CustomAnnotationDemo.class.getAnnotationsByType(Test.class);
		*/
		
		Method[] methods = CustomAnnotationDemo.class.getMethods();
		Method method = Arrays.asList(methods).stream().filter(m-> m.getName().equals("main")).findFirst().get();
	    Optional<Method> o = Optional.ofNullable(method);
	    if(o.isPresent()) {
	    	Test[] tests = method.getAnnotationsByType(Test.class);
	    	// System.out.println("tests length-"+tests.length);
			for(Test test:tests) {
				System.out.println(test.name());
			}
	    }

	}

}
