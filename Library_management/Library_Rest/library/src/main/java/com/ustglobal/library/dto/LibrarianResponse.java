package com.ustglobal.library.dto;

import java.util.List;

import lombok.Data;

@Data
public class LibrarianResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<BookInventoryBean> bookInventoryBeans;
}
