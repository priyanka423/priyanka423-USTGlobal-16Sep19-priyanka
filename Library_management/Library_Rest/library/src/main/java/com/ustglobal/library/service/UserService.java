package com.ustglobal.library.service;

import com.ustglobal.library.dto.BookInventoryBean;
import com.ustglobal.library.dto.BookIssuedBean;
import com.ustglobal.library.dto.UserBean;

public interface UserService {
	public boolean registerUser(UserBean bean);
	public UserBean login(String email, String password);
	public boolean updatePage(UserBean bean);
	public BookIssuedBean requestBook(int user_id,BookIssuedBean bean);
	public UserBean getUserData(int user_id);
	public BookInventoryBean searchBook(int book_inventory_id);
	public boolean chnagePassword(UserBean bean);
	public boolean deleteRecord(int user_id);
	
}
