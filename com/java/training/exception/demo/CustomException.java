package com.java.training.exception.demo;

public class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public CustomException(String msg) {
		super(msg);
		this.message = msg;
	}

	public String getMessage() {
		return this.message;
	}

}
