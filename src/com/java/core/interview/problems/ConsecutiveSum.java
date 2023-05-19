package com.java.core.interview.problems;

public class ConsecutiveSum {
	
	public static Integer[] nums = new Integer[] { 1,-2, 9,5,7};
	public static int result = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result = nums[0] - nums[1];
		if(result < 0) result = -result;
		
		for(int i =2;i< nums.length; i++) {
			result = result - nums[i];
			if(result <0) result = -result;
		}
		System.out.println("result is "+result);
	}

}
