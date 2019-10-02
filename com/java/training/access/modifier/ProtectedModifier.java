package com.java.training.access.modifier;

public class ProtectedModifier {
	protected String name = " protected";

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(getName());
	}

}
