package com.ustglobal.jdbc_assesement1.util;

import com.ustglobal.jdbc_assesement1.dao.MobileDAO;
import com.ustglobal.jdbc_assesement1.dao.MobileDAOImpl;

public class MobileManager {
	private MobileManager() {}

	public static MobileDAO getMobileDAO() {
		return new MobileDAOImpl();
	}
}
