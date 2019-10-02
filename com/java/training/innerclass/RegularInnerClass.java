package com.java.training.innerclass;

public class RegularInnerClass {
	
	private int x = 7;
	class Myinner{
		public void printOuterVariable() {
			System.out.println("outer var x= :"+x);
		}
	}
	
	
	
	public void makeInnerClazzObject() {
		Myinner inner = new Myinner();
		inner.printOuterVariable();
	}

}

class RegularInnerClassTest{
	void createInnerClassObjectOutside() {
		RegularInnerClass outerClass = new RegularInnerClass();
		// prints the outer class x by using outer class object, which uses inner class object
		outerClass.makeInnerClazzObject();
		
		
		//step 1
		RegularInnerClass.Myinner innerWithOuterObject = outerClass.new Myinner();
		innerWithOuterObject.printOuterVariable();
		
		//step2
		RegularInnerClass.Myinner innerWithoutOuterObject = new RegularInnerClass().new Myinner();
		innerWithoutOuterObject.printOuterVariable();
	}
}
