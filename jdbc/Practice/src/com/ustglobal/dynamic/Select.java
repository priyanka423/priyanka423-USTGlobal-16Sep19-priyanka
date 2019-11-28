package com.ustglobal.dynamic;

import java.sql.*;

public class Select {
public static void main(String[] args) {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee_info";
		conn=DriverManager.getConnection(url);
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("Id is: "+rs.getInt("id"));
			System.out.println("Name is "+rs.getString("name"));
			System.out.println("Sal is"+rs.getInt("sal"));
			System.out.println("Gender is: "+rs.getString("gender"));
		
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally{
		try {
			if(conn!=null) {
				conn.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
}
