package com.java.training.nonaccess.modifier;

public class StaticAccessModifier {
	
	static {
		System.out.println("static block");
	}
	
	StaticAccessModifier(){
		System.out.println("StaticAccessModifier-- constructor");
	}
	
	static String name = "Binoy";
	
	static void print() {
		System.out.println("static method");
	}

}
