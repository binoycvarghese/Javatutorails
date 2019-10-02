package com.java.training.innerclass;


class MyOuter4{
	static class Nest{
		void go() {
			System.out.println("static class Go method");
		}
	}
}


public class StaticNestedClass {

	
	
	static class SecondStaticClazz{
		void secondStaticClazzMethod() {
			System.out.println("second Static Clazz Method");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter4.Nest nest = new MyOuter4.Nest();
		nest.go();
		
		
		SecondStaticClazz secondClass = new SecondStaticClazz();
		secondClass.secondStaticClazzMethod();
	}

}


