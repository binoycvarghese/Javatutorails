package com.java.training.innerclass;

public class RegularInnerClassWithThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myouter.MyInner inner =new Myouter().new MyInner();
		inner.seeOuter();

	}

}

class Myouter{
	private int x = 7;
	
	class MyInner{
		public void seeOuter() {
			System.out.println("inner class refernce; "+ this);
			System.out.println("outer class refernce: "+ Myouter.this);
		}
	}
}
