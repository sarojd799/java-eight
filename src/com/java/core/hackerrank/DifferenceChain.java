package com.java.core.hackerrank;

import java.util.Scanner;

public class DifferenceChain {
	
	public static void evaluate(int[] inputs) {
		for(int i =0; i < inputs.length; i++) {
			
		}
	}

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] inputs = DifferenceChain.takeInput();
        DifferenceChain.evaluate(inputs);
	}

}
