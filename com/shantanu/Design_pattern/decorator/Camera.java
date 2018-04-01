package com.shantanu.Design_pattern.decorator;

import java.awt.Color;
import java.util.function.Function;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class Camera {
	private Function<Color, Color> filter;

	public Camera(Function<Color, Color>... filters) {
		setFilter(filters);
	}

	public void setFilter(Function<Color, Color>... filters) {
		filter = Stream.of(filters)
				.reduce(Function.identity(), Function :: andThen);

		// introduced identity functions

		// (theFilters , aFilters) -> theFilters.andThen(aFilter);
		// If we take a filter and pass it to another
		// then we can use method reference instead of lambda
		
		//instead of using this lambda use simple 
		// Function :: andThen;
	}

	public Color snap(Color color) {
		return filter.apply(color);
	}
}
