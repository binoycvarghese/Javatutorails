package com.java.training.interfacedemo;

public interface InterfaceDemo2 {
	int index = 10;

	void print();
	
	 void show();
	
	default void test() {
		System.out.println("InterfaceDemo2");
	}
}
