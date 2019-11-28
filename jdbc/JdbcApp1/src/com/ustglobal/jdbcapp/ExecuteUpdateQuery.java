package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);

			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url);

			String sql="update employee_info set name='mina',sal=500000,gender='f' where id=3";
			stmt=conn.createStatement();
			int update=stmt.executeUpdate(sql);
			System.out.println(update + "update one row(s)");

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

