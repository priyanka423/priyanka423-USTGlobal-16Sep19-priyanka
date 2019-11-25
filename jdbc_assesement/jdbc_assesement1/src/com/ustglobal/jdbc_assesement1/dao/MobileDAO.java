package com.ustglobal.jdbc_assesement1.dao;

import java.util.List;

import com.ustglobal.jdbc_assesement1.dto.MobileBean;

public interface MobileDAO {
	public MobileBean searchData(String name);
	public List<MobileBean> getAllContact();
	public int insertContactData(MobileBean bean);
	public int updateMobileData(MobileBean bean);
	public int deleteMobileData(String name);
}
