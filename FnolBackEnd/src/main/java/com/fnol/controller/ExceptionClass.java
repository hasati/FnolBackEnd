package com.fnol.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fnol.util.MyException;

@ControllerAdvice 
public class ExceptionClass extends ResponseEntityExceptionHandler{

	@ExceptionHandler(MyException.class)
/*	public void handleException(MyException ex)
	{
	   System.out.println(ex.getExceptionMsg());
	}*/
	 public final ResponseEntity<Object> handleUserNotFoundException(MyException ex,
             WebRequest request) {
return new ResponseEntity<Object>(ex.getErrorCode(), HttpStatus.NOT_FOUND);
}
}
