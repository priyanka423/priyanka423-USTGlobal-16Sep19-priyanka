package com.ustglobal.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.library.dao.LibrarianDAO;
import com.ustglobal.library.dto.BookInventoryBean;
import com.ustglobal.library.exception.LibraryManagementException;
import com.ustglobal.library.validation.RegexInfo;

@Service
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	private LibrarianDAO dao;
	
//	RegexInfo regex=new RegexInfo();
	
	@Override
	public boolean addBookInventory(BookInventoryBean bookInventory) throws LibraryManagementException {
		
		return dao.addBookInventory(bookInventory);
	}

	@Override
	public boolean updateBookInventory(BookInventoryBean bookInventory) throws LibraryManagementException {
		
		return dao.updateBookInventory(bookInventory);
	}

	@Override
	public boolean deleteBookInventory(int book_inventory_id) throws LibraryManagementException {
		return dao.deleteBookInventory(book_inventory_id);
	}
			
	@Override
	public List<BookInventoryBean> getAll() throws LibraryManagementException {
		
		return dao.getAll();
	}

	@Override
	public BookInventoryBean getBookData(int book_inventory_id) throws LibraryManagementException {
		
		return dao.getBookData(book_inventory_id);
	}

}
