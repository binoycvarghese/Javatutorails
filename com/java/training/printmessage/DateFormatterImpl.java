package com.java.training.printmessage;

import java.sql.Timestamp;
import java.util.Date;

public class DateFormatterImpl implements DateFormatter {
	
	private Date date;

	@Override
	public String getTimestamp() {
		// TODO Auto-generated method stub
		date = new Date();
		long time = date.getTime();
		Timestamp ts = new Timestamp(time);
		return ts.toString();

	}

}
