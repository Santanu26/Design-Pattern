package com.shantanu.Design_pattern.decorator;

import java.awt.Color;
import java.util.function.Function;

@SuppressWarnings("unchecked")
public class Camera {
	private Function<Color , Color> filter;
	public Camera(Function<Color , Color> ... filters) {
		setFilter(filters);
	}
	public void setFilter(Function<Color , Color> ... filters) {
		// whatever you gave me i gave to you....
		filter = color -> color;
	}
	public Color snap(Color color) {
		return filter.apply(color);
	}
}
