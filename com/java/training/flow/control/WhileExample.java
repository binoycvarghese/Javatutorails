package com.java.training.flow.control;

public class WhileExample {

	public static void main(String[] args) {
		int index = 0;
		while (index < 5) {

			System.out.println("index: " + index);
			index++;
		}

		
		System.out.println("using continue");
		
		index = 0;

		while (index < 5) {
			if (index == 3) {
				index++;
				continue;
			}
			System.out.println("index: " + index);
			index++;
		}
		
	}
}
