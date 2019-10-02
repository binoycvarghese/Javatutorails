package com.java.training.printmessage;

public class DateFormatterFactory {
	
	public static DateFormatter getFormatter() {
		return new DateFormatterImpl();
	}

}
