package com.ustglobal.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.library.dao.IssuedDAO;
import com.ustglobal.library.dto.BookIssuedBean;
import com.ustglobal.library.exception.LibraryManagementException;

@Service
public class IssuedServiceImpl implements IssuedService{

	@Autowired
	private IssuedDAO dao;
	@Override
	public boolean addBookIssued(BookIssuedBean bookIssued) throws LibraryManagementException {
		
		return dao.addBookIssued(bookIssued);
	}

	@Override
	public boolean updateBookIssued(BookIssuedBean bookIssued) throws LibraryManagementException {
		
		return dao.updateBookIssued(bookIssued);
	}

	@Override
	public boolean deleteBookIssued(int book_issued_id) throws LibraryManagementException {
		
		return dao.deleteBookIssued(book_issued_id);
	}

	@Override
	public List<BookIssuedBean> getAllIssued() throws LibraryManagementException {
		return dao.getAllIssued();
	}

	@Override
	public BookIssuedBean getBookIssuedData(int book_issued_id) throws LibraryManagementException {
		return dao.getBookIssuedData(book_issued_id);
	}

}
