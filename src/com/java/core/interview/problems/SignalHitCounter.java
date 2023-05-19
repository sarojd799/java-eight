package com.java.core.interview.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SignalHitCounter {

	public static Integer[] inputs = new Integer[4];

	public static Integer result = 0;

	public static Integer countHits(Integer[] ips) {

		List<String> nums = Arrays.asList(inputs).stream().map(n -> n.toString()).collect(Collectors.toList());

		for (int i = 0; i < nums.get(0).split("").length; i++) {
			String bit = nums.get(0).split("")[i];
			int index = i;
			boolean match = nums.stream().allMatch(num-> {
				return num.split("")[index].equals(bit) && !bit.equals("0");
			});
			if(match) {
				result += 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < inputs.length; i++) {
				inputs[i] = sc.nextInt();
			}
		}
		System.out.println("Hit count is "+countHits(inputs));

	}

}
