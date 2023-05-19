package com.java.core.interview;


public class ThreadExample extends Thread {
	
    public void run() {
    	System.out.println("TEST");
    }

	public static void main(String[] args) {
		
		//To use method reference it must be a functional interface
        Runnable r = new ThreadExample()::run; 
        new Thread(r).start();
	}

}
