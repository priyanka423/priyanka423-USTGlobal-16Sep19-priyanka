package com.ustglobal.stockmanagement.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.stockmanagement.dto.ProductInfoResponse;

@RestControllerAdvice
public class HandleException {

	@ExceptionHandler(Exception.class)
	public ProductInfoResponse getException() {
		ProductInfoResponse response=new ProductInfoResponse();
		response.setStatusCode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got an Exception");
		return response;
	}
}
