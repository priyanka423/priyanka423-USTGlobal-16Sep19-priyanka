package com.ustglobal.library.dao;

import java.util.List;

import com.ustglobal.library.dto.BookInventoryBean;
import com.ustglobal.library.dto.BookIssuedBean;
import com.ustglobal.library.exception.LibraryManagementException;

public interface IssuedDAO {
	public boolean addBookIssued(BookIssuedBean bookIssued) throws LibraryManagementException;
	public boolean updateBookIssued(BookIssuedBean bookIssued) throws LibraryManagementException;
	public boolean deleteBookIssued(int book_issued_id) throws LibraryManagementException;
	public List<BookIssuedBean> getAllIssued() throws LibraryManagementException;
	public BookIssuedBean getBookIssuedData(int book_issued_id) throws LibraryManagementException;
}
