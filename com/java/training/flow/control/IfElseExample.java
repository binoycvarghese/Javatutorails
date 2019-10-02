package com.java.training.flow.control;

public class IfElseExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		if (a > b) {
			System.out.println("a is greater than b");
		}

		System.out.println(" if else statement");

		if (a < b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is less than a");
		}

		System.out.println("multiple if else statement");
		
		
		if (a > b) {
			System.out.println("a is greater than b");
		} else if (a == 20) {
			System.out.println("a==20");
		} else {
			System.out.println("b is less than a");
		}
		
	}

}
