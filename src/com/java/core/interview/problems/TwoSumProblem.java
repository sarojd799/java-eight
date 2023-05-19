package com.java.core.interview.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//[2,7,11,15], 9
//[3,2,4],6
public class TwoSumProblem {

	
	public static List<Integer> nums = new ArrayList<Integer>();
	
	public static int target = 10;
	
	public static int count = 0;
	
	public static List<String> pairs = new ArrayList<String>();
	
	public static int l;
	public static int r;
	
	
	/*
	 The idea is to use the two-pointer technique. But for using the two-pointer technique, 
	 the array must be sorted. Once the array is sorted the two pointers can be taken which mark 
	 the beginning and end of the array respectively. If the sum is greater than the sum of those two elements, 
	 shift the right pointer to decrease the value of the required sum and if the sum is lesser than the required value, 
	 shift the left pointer to increase the value of the required sum.
	 
	 */
	
	//1,2,3,4,5
	public static void printPairsOptimalWay() {//[3,2,4],6=>[2,3,4]
		pairs.clear();
		while(l<r) {//[0,2]
			if(nums.get(l) + nums.get(r) == target) {
				pairs.add(nums.get(l)+","+nums.get(r));
				r--;
			} else if(nums.get(l) + nums.get(r) < target) {
				l+=1;
			} else {//1
				r-=1;
			}
		}
		System.out.println("optimal way" +pairs);
		
	}
	
	public static void printPairsNaiveWay() {
		pairs.clear();
		for(int i = 0 ; i < nums.size();i++) {
			for(int j = i+1; j < nums.size(); j++) {
				 if(nums.get(i) + nums.get(j) == target) {
					 pairs.add(nums.get(i)+","+nums.get(j));
				 }
			}
		}
		if(pairs.size() == 0) {
			System.out.println("No pairs found");
		} else {
			System.out.println("Naive way :"+pairs);
		}
	}
	
	public static void main(String[] args) {
		//nums = List.of(8,3,7,2);
		//Integer[] numArr = new Integer[] {3,2,4};
		Integer[] numArr = new Integer[] {8,7,3,2};
		nums = Arrays.asList(numArr);
		printPairsNaiveWay();
		
		
		Arrays.sort(numArr);
		nums = List.of(numArr);
		l=0;
		r=nums.size()-1;
		printPairsOptimalWay();
	}

}
