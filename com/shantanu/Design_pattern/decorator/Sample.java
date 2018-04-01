package com.shantanu.Design_pattern.decorator;

import java.awt.Color;

public class Sample {
	public static void printSnap(Camera camera) {
		System.out.println(camera.snap(new Color(125, 125, 125)));
	}
	
	public static void main(String[] args) {
		printSnap(new Camera());
	}
}
