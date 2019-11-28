package com.ustglobal.jdbcapp3;
import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

//import com.mysql.jdbc.Driver;
public class JdbcWithProperties{
	public static void main(String[] args) {
		Connection conn=null; 
		Statement stmt=null;
		ResultSet rs=null;
		FileReader reader=null;
		try {
			reader=new FileReader("text1.properties");
			Properties prop=new Properties();
			prop.load(reader);
			//1st step: Load the Driver
			//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName(prop.getProperty("driver-class-name"));
			// 2nd step: Get the connection

			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url,prop);

			stmt=conn.createStatement();

			// 3rd step: Issue SQL Query
			String sql=prop.getProperty("select-query");
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

		}catch(Exception e) {
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
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}// end of main()
}// end of MyFirstJDBC



