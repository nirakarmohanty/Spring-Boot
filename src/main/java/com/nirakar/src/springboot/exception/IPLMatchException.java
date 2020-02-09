package com.nirakar.src.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class IPLMatchException extends RuntimeException {

	public IPLMatchException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IPLMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IPLMatchException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IPLMatchException(String message) {
		super(message);
		
	}

	public IPLMatchException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
