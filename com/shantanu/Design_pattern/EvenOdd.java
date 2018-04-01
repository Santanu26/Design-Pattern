package com.shantanu.Design_pattern;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {

	private static int totalValues(List<Integer> numbers) {
		int results = 0;
		for (int i : numbers) {
			results += i;
		}
		return results;
	}
	
	private static int totalEvenValues(List<Integer> numbers) {
		int results = 0;
		for (int i : numbers) {
			if(i%2 ==0)
			 results += i;
		}
		return results;
	}
	
	private static int totalOddValues(List<Integer> numbers) {
		int results = 0;
		for (int i : numbers) {
			if(i%2 !=0)
			 results += i;
		}
		return results;
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(totalValues(numbers));
		System.out.println(totalEvenValues(numbers));
		System.out.println(totalOddValues(numbers));
	}

}
