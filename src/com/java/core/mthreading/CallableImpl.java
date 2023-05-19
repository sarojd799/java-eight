package com.java.core.mthreading;

import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableImpl implements Callable {
	
	public Object call() throws Exception  {
		System.out.println("Executing callable");
		return UUID.randomUUID();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallableImpl c = new CallableImpl();
		FutureTask<CallableImpl> ft = new FutureTask<CallableImpl>(c);
		Thread t = new Thread(ft);
		t.start();
		
		

	}

}
