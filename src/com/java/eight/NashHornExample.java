package com.java.eight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
 Nashorn is a JavaScript engine. 
 It is used to execute JavaScript code dynamically at JVM (Java Virtual Machine). 
 Java provides a command-line tool jjs which is used to execute JavaScript code.
 You can execute JavaScript code by using jjs command-line tool and by embedding into Java source code.
 
 */
public class NashHornExample {

	public static void main(String[] args) throws Exception {

		File f = new File("./src/com/java/eight/app.js");

		ScriptEngineManager sem = new ScriptEngineManager();
		System.out.println("Engines count: " + sem.getEngineFactories().size());
		sem.getEngineFactories().forEach(factory -> System.out.println(factory.getEngineName()));

		ScriptEngine se = sem.getEngineByName("Nashorn");
		Optional.ofNullable(se).ifPresent(seRef-> {
			try {
				seRef.eval(new FileReader(f.getAbsolutePath()));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		
	

	}

}
