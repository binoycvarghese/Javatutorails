package com.java.training.flow.control;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "binoy";

		switch (name) {
		case "binoy": {
			System.out.println("Binoy");
		}
		case "Juan": {
			System.out.println("Juan");
		}
		default: {
			System.out.println("No Name mentioned");
		}
		}
		
		
		System.out.println("using break statement");
		
		
		switch (name) {
		case "binoy": {
			System.out.println("Binoy");
			break;
		}
		case "Juan": {
			System.out.println("Juan");
			break;
		}
		default: {
			System.out.println("No Name mentioned");
			break;
		}
		}


	}

}
