package com.java.training.interfacedemo;

public interface InterfaceDemo1 {
	 void show();
	int index =10;

	default void test() {
		System.out.println("InterfaceDemo1");
	}
}
