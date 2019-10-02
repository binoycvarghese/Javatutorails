package com.java.training.abstractdemo;

public class AbstractClazzImpl extends AbstractClazz {
	
	
	AbstractClazzImpl(){
		System.out.println("default constructor in implementation");
	}
	AbstractClazzImpl(String name){
		super(name);
		System.out.println("default constructor in implementation");
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("AbstractImpl print method");
	}
	
	public static void main(String[] args) {
		AbstractClazzImpl abs = new AbstractClazzImpl("Binoy");
		System.out.println(abs.name);
		AbstractClazzImpl abs1 = new AbstractClazzImpl("John");
		System.out.println(abs1.name);
	}
	
}
