package com.java.training.exception.demo;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value1 =10;
		int value2 =0;
		int result = 0;
		//result = value1/value2;
		//System.out.println("result : "+ result);
	
		
		try {
			result = value1/value2;
		}
		//System.out.println("exception occured");
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception occured"+e.getMessage());
			e.printStackTrace();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("exception handled");
		}
		
		/*
		
		try {
			result = value1/value2;
		}catch (Exception e) {
			// TODO: handle exception
			result = value1/value2;
			System.out.println("exception occured");
			
		}finally {
			System.out.println("finally block");
		}
		
		*/
		
		System.out.println("try without catch block");
		
		try {
			result = value1/value2;
		}finally {
			System.out.println("finally block");
		}

	}

}
