package com.ustglobal.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.library.dao.UserDAO;
import com.ustglobal.library.dto.BookInventoryBean;
import com.ustglobal.library.dto.BookIssuedBean;
import com.ustglobal.library.dto.UserBean;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO dao;

	@Override
	public boolean registerUser(UserBean bean) {
		if(bean.getEmail()==null||bean.getPassword()==null||bean.getEmail()=="") {
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.registerUser(bean);

	}

	@Override
	public UserBean login(String email, String password) {
				return dao.login(email, password);
	}
	@Override
	public boolean updatePage(UserBean bean) {
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.updatePage(bean);

	}

	@Override
	public BookIssuedBean requestBook(int user_id,BookIssuedBean bean) {

		return dao.requestBook(user_id, bean);
	}

	@Override
	public UserBean getUserData(int user_id) {

		return dao.getUserData(user_id);
	}

	@Override
	public BookInventoryBean searchBook(int book_inventory_id) {

		return dao.searchBook(book_inventory_id);
	}

	@Override
	public boolean chnagePassword(UserBean bean) {

	if(bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.chnagePassword(bean);
	}

	@Override
	public boolean deleteRecord(int user_id) {

		return dao.deleteRecord(user_id);
	}

}