package com.ustglobal.empapp.dao;

import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public interface EmployeeDAO {
	public EmployeeBean serchEmployeeData(int id);
	public List<EmployeeBean> getAllEmployee();
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);
}
