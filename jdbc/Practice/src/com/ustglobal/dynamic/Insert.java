package com.ustglobal.dynamic;

import java.sql.*;

public class Insert {
public static void main(String[] args) {
	Connection conn=null;
	PreparedStatement pstmt=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn=DriverManager.getConnection(url);
		String sql="insert into employee_info values(?,?,?,?)";
		pstmt=conn.prepareStatement(sql);
		
String empid=args[0];
int id=Integer.parseInt(empid);

String name=args[1];

String emsal=args[2];
int sal=Integer.parseInt(emsal);

String gender=args[3];

pstmt.setInt(1, id);
pstmt.setString(2,name);
pstmt.setInt(3, sal);
pstmt.setString(4, gender);


		int insert=pstmt.executeUpdate();
		System.out.println(insert);
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
}
