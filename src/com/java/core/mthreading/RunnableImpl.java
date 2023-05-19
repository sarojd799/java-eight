package com.java.core.mthreading;

public class RunnableImpl implements Runnable {
	
	public void run() {
		System.out.println("running runnable");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread t = new Thread(new RunnableImpl());
       t.start();
	}

}
