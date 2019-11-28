package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;
public class MyFirstJdba {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			//1st step: Load the Driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);

			// 2nd step: Get the connection

			// String url="jdbc:mysql://localhost:3306/ust_ty_db?"
			//	+"user=root&password=root";

			String url="jdbc:mysql://localhost:3306/ust_ty_db?";
			conn=DriverManager.getConnection(url,"root","root");

			stmt=conn.createStatement();

			// 3rd step: Issue SQL Query
			String sql="select * from employee_info";
			rs=stmt.executeQuery(sql);

			// 4th step: Read the result
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int sal=rs.getInt("sal");
				String gender=rs.getString("gender");
				System.out.println(" Id is "+id);
				System.out.println(" Name is "+name);
				System.out.println(" Sal is "+sal);
				System.out.println(" Gender is "+gender);
				System.out.println("............................");
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {

			// Step 5: Closed all the JDBC objects
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}// end of main()
}// end of MyFirstJDBC

