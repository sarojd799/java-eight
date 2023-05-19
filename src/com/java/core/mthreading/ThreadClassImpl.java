package com.java.core.mthreading;

public class ThreadClassImpl extends Thread {

	public void run() {
	   System.out.println("running");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ThreadClassImpl tci = new ThreadClassImpl();
         tci.start();
	}

}
