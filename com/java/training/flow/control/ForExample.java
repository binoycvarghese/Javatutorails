package com.java.training.flow.control;

public class ForExample {

	public static void main(String[] args) {
		for (int index = 0; index < 3; index++) {
			if( index == 1) {
				break;
			}
			System.out.println("index : " + index);
		}

		
		
		System.out.println("enhanced for loop");

		int[] array = { 1, 2, 3 };
		for (int x : array) {
			System.out.println(x);
		}
		
	}

}
