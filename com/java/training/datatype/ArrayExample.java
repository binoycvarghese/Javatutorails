package com.java.training.datatype;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array;
		array = new int[10];
		int [] array1 = new int[10];
		int array2[] = new int[10];
		
		
		int array3[] = {1,2,3};
		for(int x: array) {
			System.out.println(x);
		}
		System.out.println("============");
		for(int x : array3) {
			System.out.println(x);
		}
		
		ArrayExample arrayExample = new ArrayExample();
	}

}
