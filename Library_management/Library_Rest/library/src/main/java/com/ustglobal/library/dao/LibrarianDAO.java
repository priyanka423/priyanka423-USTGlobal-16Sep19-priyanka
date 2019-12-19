package com.ustglobal.library.dao;

import java.util.List;

import com.ustglobal.library.dto.BookInventoryBean;
import com.ustglobal.library.dto.UserBean;
import com.ustglobal.library.exception.LibraryManagementException;

public interface LibrarianDAO {
	public boolean addBookInventory(BookInventoryBean bookInventory) throws LibraryManagementException;
	public boolean updateBookInventory(BookInventoryBean bookInventory) throws LibraryManagementException;
	public boolean deleteBookInventory(int book_inventory_id) throws LibraryManagementException;
	public List<BookInventoryBean> getAll() throws LibraryManagementException;
	public BookInventoryBean getBookData(int book_inventory_id) throws LibraryManagementException;

}
