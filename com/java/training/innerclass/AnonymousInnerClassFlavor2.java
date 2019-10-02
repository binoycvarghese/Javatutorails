package com.java.training.innerclass;

public class AnonymousInnerClassFlavor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cook2().cook.cook();

	}

}


interface Cookable{
	void cook();
}

class Cook2{
	
	Cookable cook = new Cookable() {
		
		@Override
		public void cook() {
			// TODO Auto-generated method stub
			System.out.println("anonymous cookable");
		}
	};
}

