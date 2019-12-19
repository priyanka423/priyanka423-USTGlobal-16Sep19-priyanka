package com.ustglobal.library.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.library.dto.BookInventoryBean;
import com.ustglobal.library.dto.BookIssuedBean;
import com.ustglobal.library.dto.LibrarianResponse;
import com.ustglobal.library.dto.UserBean;
import com.ustglobal.library.dto.UserResponse;
import com.ustglobal.library.service.LibrarianService;
import com.ustglobal.library.service.UserService;

@RestController
@CrossOrigin(origins = "*",allowCredentials = "true")
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private LibrarianService service1;

	@PostMapping(path="/register",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse registerUser(@RequestBody UserBean bean) {
		UserResponse response=new UserResponse();
		if(service.registerUser(bean)) {
			response.setStatusCode(201);
			response.setMessage("successfully registered");
			response.setDescription("Data added to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not added to the DB");

		}
		return response;
	}
	
	@PostMapping(path="/login",
			produces = MediaType.APPLICATION_JSON_VALUE)
		public UserResponse login(@RequestParam("email") String email,@RequestParam("password") String password) {
		UserResponse response=new UserResponse();
		UserBean bean=service.login(email,password);
		if(bean!=null){
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data fornd");
			response.setUserBeans(Arrays.asList(bean));
			
			 // here it is creating one array and pass into the object for fetching the one row of data//
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}

	@PutMapping(path="/update",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse modifyEmployee(@RequestBody UserBean bean) {
		System.out.println(bean);
		UserResponse response=new UserResponse();
		if(service.updatePage(bean)) {
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
	@PutMapping(path="/changepassword",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
			
		public UserResponse chnagePassword(@RequestBody UserBean bean) {
		System.out.println(bean);
		UserResponse response=new UserResponse();
		if(service.chnagePassword(bean)){
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
	@DeleteMapping(path="/delete/{user_id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteEmployee(@PathVariable("user_id") int user_id) { 
		UserResponse response=new UserResponse();
		if(service.deleteRecord(user_id)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data deleted to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data deleted not to the DB");

		}
		return response;
	}

	@GetMapping(path="/get",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse getUserData(@RequestParam("user_id") int user_id) {
		UserResponse response=new UserResponse();
		UserBean bean=service.getUserData(user_id);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in  the DB");
			response.setUserBeans(Arrays.asList(bean)); // here it is creating one array and pass into the object for fetching the one row of data//
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}
	
	// for requestBook
	@GetMapping(path="/search",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibrarianResponse requestBook(@RequestParam("book_inventory_id") int book_inventory_id) {
				LibrarianResponse response=new LibrarianResponse();
				BookInventoryBean bean=service.searchBook(book_inventory_id);
				if(bean!=null) {
					response.setStatusCode(201);
					response.setMessage("success");
					response.setDescription("Book name  is "+bean);
				}else {
					response.setStatusCode(401);
					response.setMessage("failure");
					response.setDescription("Book not Searched");

				}
				return response;
				}
	
	
	
	@PostMapping(path="/requestBook",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibrarianResponse request(@RequestParam(name="user_id") int user_id,
			@RequestBody BookIssuedBean bean) {
		BookInventoryBean reg=null;
		LibrarianResponse response=new LibrarianResponse();
		BookIssuedBean bean1=service.requestBook(user_id,bean);
		if(bean1!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Book name  is "+bean);
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Book not Searched");

		}
		return response;
	}
	
			


}
