package com.mobile.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MobileExceptions extends RuntimeException {

	@ExceptionHandler(Exception.class)
	
}