package com.nutrition.aplication.exception;

public class NutricionistaResourceException extends Exception{

	private static final long serialVersionUID = 7698763010009476881L;

	public NutricionistaResourceException() {
		super();		
	}

	public NutricionistaResourceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);	
	}

	public NutricionistaResourceException(String message, Throwable cause) {
		super(message, cause);		
	}

	public NutricionistaResourceException(String message) {
		super(message);	
	}

	public NutricionistaResourceException(Throwable cause) {
		super(cause);		
	}
	
}
