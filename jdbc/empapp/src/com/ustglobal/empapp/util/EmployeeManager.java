package com.ustglobal.empapp.util;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;

// It is a EmployeeFactory class//
public class EmployeeManager {
	private EmployeeManager() {}
	// factory method
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();

	}

}
