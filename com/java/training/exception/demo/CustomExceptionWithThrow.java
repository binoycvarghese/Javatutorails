package com.java.training.exception.demo;

public class CustomExceptionWithThrow {

	void demo() throws CustomException  {
		
		try {
			throw new CustomException("my custom exception");
		} catch (CustomException e) {
			// TODO Auto-generated catch block
		System.out.println("exception occured");
		throw e;
		}
		
	}

	public static void main(String[] args) {
		CustomExceptionWithThrow c = new CustomExceptionWithThrow();
		
	}

}
