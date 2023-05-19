package com.java.core.mthreading;

public class ThreadWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = ()->{
			System.out.println("Hello");
		};
		Thread t = new Thread(r);
		t.start();

	}

}
