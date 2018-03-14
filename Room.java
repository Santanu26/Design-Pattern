package com.shantanu.composite;

public class Room implements Istructure {

	public String flatName;

	public Room() {
	}

	public Room(String flatName) {
		
		this.flatName = flatName;
	}

	public void setFlatName(String flatName) {
		this.flatName = flatName;
	}

	@Override
	public void enter() {
		System.out.println("You Entered: " + this.flatName);
	}

	@Override
	public void exit() {
		System.out.println("You Left: " + this.flatName);

	}

	@Override
	public void location() {
		System.out.println("You are currently: " + this.flatName);
	}

	@Override
	public String getName() {
		return flatName;
	}

	

}
