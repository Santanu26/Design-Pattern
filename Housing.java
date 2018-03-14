package com.shantanu.composite;

import java.util.ArrayList;

public class Housing implements Istructure {
	private ArrayList<Istructure> structures;
	private String address;

	public Housing(String address) {
		// super();
		this.structures = new ArrayList<Istructure>();
		this.address = address;
	}

	public int addStructure(Istructure component) {
		this.structures.add(component);
		return this.structures.size() - 1;
	}

	public Istructure getStructures(int componentNumber) {
		return this.structures.get(componentNumber);
	}

	public void setStructures(ArrayList<Istructure> structures) {
		this.structures = structures;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void enter() {
    System.out.println("Enter : " + this.getName());
	}

	@Override
	public void exit() {
    System.out.println("Exit : " + this.getName());
	}

	@Override
	public void location() {
		System.out.println("You are currently: " + this.getName());
		for (Istructure structure : this.structures) {
			System.out.println(structure.getName());
		}
	}

	@Override
	public String getName() {
		return this.address;
	}

}
