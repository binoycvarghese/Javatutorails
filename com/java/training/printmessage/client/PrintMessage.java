package com.java.training.printmessage.client;

import java.util.Scanner;

import com.java.training.printmessage.DateFormatter;
import com.java.training.printmessage.DateFormatterFactory;

public class PrintMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateFormatter formatter = DateFormatterFactory.getFormatter();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first message");
		String message = input.nextLine();
		String timeStamp = formatter.getTimestamp();
		System.out.println("First message from client : "+timeStamp+" : "+ message);
		System.out.println("Enter second message");
		message = input.nextLine();
		timeStamp = formatter.getTimestamp();
		System.out.println("Second message from client : "+timeStamp+" : "+ message);
		
	}

}
