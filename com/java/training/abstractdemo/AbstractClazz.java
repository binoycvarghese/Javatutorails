package com.java.training.abstractdemo;

public abstract class AbstractClazz {
	public String name;

	public AbstractClazz() {
		System.out.println("abstract class default interface");
	}

	public AbstractClazz(String name) {
		System.out.println("parameterized constructor");
		this.name = name;

	}

	abstract void print();
	


}
