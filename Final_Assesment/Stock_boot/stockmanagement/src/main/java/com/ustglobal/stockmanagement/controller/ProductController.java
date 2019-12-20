package com.ustglobal.stockmanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.dto.ProductInfoResponse;
import com.ustglobal.stockmanagement.dto.Products_Info;
import com.ustglobal.stockmanagement.service.ProductService;


@RestController
@CrossOrigin(origins = "*",allowCredentials = "true")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(path="/register",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse addProduct(@RequestBody Products_Info bean) {
		ProductInfoResponse response=new ProductInfoResponse();
		if(service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not added to the DB");

		}
		return response;
	}
	
	@PutMapping(path="/update",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse modifyProduct(@RequestBody Products_Info bean) {
		ProductInfoResponse response=new ProductInfoResponse();
		if(service.modifyProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data modified to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data modified not added to the DB");

		}
		return response;
	}
	
	@GetMapping(path="/get-name",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse getProductByName(@RequestParam("name") String name) {
		ProductInfoResponse response=new ProductInfoResponse();
		Products_Info bean=service.getProductByName(name);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in  the DB");
			response.setProductsBean(Arrays.asList(bean)); 
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}

	@GetMapping(path="/get-company",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse getProductByCompany(@RequestParam("company") String company) {
		ProductInfoResponse response=new ProductInfoResponse();
		List<Products_Info> bean=service.getProductByCompany(company);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in  the DB");
			response.setProductsBean((bean)); 
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}
	
	@GetMapping(path="/get-category",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse getProductByCategory(@RequestParam("category") String category) {
		ProductInfoResponse response=new ProductInfoResponse();
		List<Products_Info> bean=service.getProductByCategory(category);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in  the DB");
			response.setProductsBean(bean); 
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
}
}
