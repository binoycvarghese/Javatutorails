package com.java.training.interfacedemo;

public class InterfaceImpl implements InterfaceDemo1, InterfaceDemo2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	public void test() {
		InterfaceDemo1.super.test();
		InterfaceDemo2.super.test();
	}
	
	public static void main(String[] args) {
		InterfaceImpl interfaceImpl  = new InterfaceImpl();
		interfaceImpl.test();
	}
	
}

