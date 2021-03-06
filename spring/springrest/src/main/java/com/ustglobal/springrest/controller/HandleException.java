package com.ustglobal.springrest.controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeResponse;

@RestControllerAdvice // it used in the springmvc
public class HandleException {

	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException(Exception e) {
		e.printStackTrace();
		EmployeeResponse response=new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got an Exception");
		return response;
	}
}
