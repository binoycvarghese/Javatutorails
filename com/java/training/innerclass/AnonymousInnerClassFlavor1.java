package com.java.training.innerclass;

public class AnonymousInnerClassFlavor1 {
	
	public static void main(String[] args) {
	new Food().printAnonymous();
	}

}

class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}


class Food{
	private String str = "String";
	Popcorn p = new Popcorn() {
		public void pop() {
			System.out.println("anonymous popcorn");
		}
	};
	
	void printAnonymous() {
		p.pop();
	}
}