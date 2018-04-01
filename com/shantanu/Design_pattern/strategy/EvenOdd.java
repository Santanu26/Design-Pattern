package com.shantanu.Design_pattern.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.shantanu.Design_pattern.util.Util;

public class EvenOdd {

	private static int totalValues(List<Integer> numbers, Predicate<Integer> selectors) {
		return numbers.stream()
				.filter(selectors)
				.mapToInt(e->e)
				.sum();
	}
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(totalValues(numbers, e -> true));
		System.out.println(totalValues(numbers, Util:: isEven));
		System.out.println(totalValues(numbers, Util:: isOdd));

	}

}
