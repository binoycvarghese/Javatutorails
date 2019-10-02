package com.java.training.innerclass;

public class ArgumentDefinedInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Myouter3().callArgumentDefinedInner();
	}

}

interface Foo {
	String foo();
}

class Bar {
	void doStuff(Foo f) {
		System.out.println(f.foo());
	}
}

class Myouter3 {
	void callArgumentDefinedInner() {
		Bar bar = new Bar();
		bar.doStuff(new Foo() {

			@Override
			public String foo() {
				// TODO Auto-generated method stub
				return "This is argument defined anonymous innerclass";
			}
		});
	}
}