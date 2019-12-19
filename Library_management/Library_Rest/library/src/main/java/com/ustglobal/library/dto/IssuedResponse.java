package com.ustglobal.library.dto;

import java.util.List;

import lombok.Data;

@Data
public class IssuedResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<BookIssuedBean> bookIssuedBeans;
}
