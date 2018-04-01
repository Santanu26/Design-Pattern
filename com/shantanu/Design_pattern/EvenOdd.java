package com.shantanu.Design_pattern;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EvenOdd {

	private static int totalValues(List<Integer> numbers, Predicate<Integer> selectors) {
		/*int results = 0;
		for (int i : numbers) {
			if (selectors.test(i))
				results += i;
		}*/
		return numbers.stream()
				.filter(selectors)
				.mapToInt(e->e)
				.sum();
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(totalValues(numbers, e -> true));
		System.out.println(totalValues(numbers, e -> e % 2 == 0));
		System.out.println(totalValues(numbers, e -> e % 2 != 0));

	}

}
