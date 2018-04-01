package com.shantanu.Design_pattern.decorator;

import java.util.function.Function;

public class SimpleIncrement {
	public static void doWork(int value, Function<Integer, Integer> func) {
		System.out.println(func.apply(value));
	}

	public static void main(String[] args) {
		Function<Integer, Integer> inc = e -> e + 1;
		Function<Integer, Integer> doubleIt = e -> e * 2;

		doWork(3, inc);
		doWork(3, doubleIt);
	    doWork(3, inc.andThen(doubleIt));
	
	}

}
