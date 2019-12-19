package com.ustglobal.library.service;

import java.util.List;

import com.ustglobal.library.dto.BookInventoryBean;
import com.ustglobal.library.exception.LibraryManagementException;

public interface LibrarianService {
	public boolean addBookInventory(BookInventoryBean bookInventory) throws LibraryManagementException;
	public boolean updateBookInventory(BookInventoryBean bookInventory) throws LibraryManagementException;
	public boolean deleteBookInventory(int book_inventory_id) throws LibraryManagementException;
	public List<BookInventoryBean> getAll() throws LibraryManagementException;
	public BookInventoryBean getBookData(int book_inventory_id) throws LibraryManagementException;

}
