package com.java.training.exception.demo;

public class ExceptionHierarchyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value1 =10;
		int value2 =0;
		int result = 0;
		//result = value1/value2;
		
		try {
			result = value1/value2;
		}
		
		catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("RuntimeException occured");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured");
		}

	}

}
