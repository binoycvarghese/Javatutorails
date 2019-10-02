package com.java.training.innerclass;

public class MethodLocalInnerClazz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Myouter2 {

	void outerMethod() {
		 int x = 0;
		// x = 2;
		class MyMethodLocal {
			void print() {
				System.out.println("method local variable x= " + x);
			}
		}

		MyMethodLocal localClazz = new MyMethodLocal();// it should come after clazz declaration
	}
}
