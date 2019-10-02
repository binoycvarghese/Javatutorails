package com.java.training.oops;

import com.java.training.access.modifier.ProtectedModifier;

public class TestProtectedClazz extends ProtectedModifier {
	
	public void test() {
		
		TestProtectedClazz tpc = new TestProtectedClazz();
		System.out.println(tpc.getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestProtectedClazz t = new TestProtectedClazz();
		t.test();
	}

}
