package com.shantanu.Design_pattern.decorator;

import java.awt.Color;
import java.util.function.Function;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class Camera {
	private Function<Color , Color> filter;
	public Camera(Function<Color , Color> ... filters) {
		setFilter(filters);
	}
	public void setFilter(Function<Color , Color> ... filters) {
		filter = Stream.of(filters)
				.reduce(color->color,
				  (theFilters , aFilter) -> theFilters.andThen(aFilter));
	}
	public Color snap(Color color) {
		return filter.apply(color);
	}
}
