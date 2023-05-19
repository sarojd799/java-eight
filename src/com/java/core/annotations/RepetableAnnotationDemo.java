package com.java.core.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

/*
 * The containing annotation type must have a value element with an array type
 * In this case Games is a  container annotation and it needs to have a value property
 */

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Games.class)
@interface Game {
	String name();
	String day();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Games {
	Game[] value();
}


public class RepetableAnnotationDemo {

	@Game(name="cricket", day="sunday")
	@Game(name="soccer", day="monday")
	@Game(name="Tennis", day="tuesday")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method[] methods = RepetableAnnotationDemo.class.getMethods();
		Method method = Arrays.asList(methods).stream().filter(m-> m.getName().equals("main")).findFirst().get();
	    Optional<Method> o = Optional.ofNullable(method);
	    if(o.isPresent()) {
	    	Game[] games = method.getAnnotationsByType(Game.class);
	    	// System.out.println("tests length-"+tests.length);
			for(Game game:games) {
				System.out.println(game.name()+" will be played on "+ game.day());
			}
	    }

	}

}
