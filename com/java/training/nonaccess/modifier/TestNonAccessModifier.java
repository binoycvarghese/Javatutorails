package com.java.training.nonaccess.modifier;

public class TestNonAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticAccessModifier sam = new StaticAccessModifier();
		System.out.println(sam.name);
		sam.name = "changed";
		StaticAccessModifier sam1 = new StaticAccessModifier();
		System.out.println(sam1.name);
		System.out.println(StaticAccessModifier.name);
		StaticAccessModifier.print();

	}

}
