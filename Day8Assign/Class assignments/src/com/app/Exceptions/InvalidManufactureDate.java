package com.app.Exceptions;

import java.time.LocalDate;

public class InvalidManufactureDate extends Exception {
	private String message;
	private LocalDate date;
	public InvalidManufactureDate() {
		
	}
	public InvalidManufactureDate(String message,LocalDate date) {
		this.date=date;
		this.message= message;
	}
	@Override
	public  String getMessage() {
		return "Date :"+date+" ,Exception :"+message;
		
	}

}
