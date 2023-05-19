package com.java.core.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ProveObject {

	@Override
	public String toString() {
		return this.getClass().getName()+ UUID.randomUUID();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProveObject po = new ProveObject();
         System.out.println(po.getClass().getSuperclass());
         
         Map m = new HashMap();
         m.put(po, "Hi");
         m.put(po, "Hello");
         System.out.println(m);
	}

}
