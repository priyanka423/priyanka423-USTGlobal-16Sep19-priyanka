package com.ustglobal.jdbcapp3;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class InsertQuery {		

	public static void main(String[] args) {
		Connection conn=null; // import java.sql.connection;
		Statement stmt=null;
		try {
			// Step 1: Load the Driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);

			// 2nd step: Get the Connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url);

			//3rd step: Issue the sql query

			String sql="insert into employee_info values("+args[0]+",'"+args[1]+"',"+args[2]+",'"+args[3]+"')";
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(sql);

			// 4th step: Read the Result
			System.out.println(count + " Row(s) inserted");

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {

			// 5th step: Closed all the JDBC Objects
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

	}// end of main()
}// end of ExecuteInsertQuery 






