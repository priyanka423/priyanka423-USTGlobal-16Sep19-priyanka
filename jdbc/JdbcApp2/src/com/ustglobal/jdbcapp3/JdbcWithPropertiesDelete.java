package com.ustglobal.jdbcapp3;

import java.io.FileReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JdbcWithPropertiesDelete {
	public static void main(String[] args) {
		Connection conn=null; 
		PreparedStatement pstmt=null;
		FileReader reader=null;
		try {
			reader=new FileReader("text1.properties");
			Properties prop=new Properties();
			prop.load(reader);
			//1st step: Load the Driver
			//		Class.forName("com.mysql.jdbc.Driver");
			Class.forName(prop.getProperty("driver-class-name"));
			// 2nd step: Get the connection

			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url,prop);

			// 3rd step: Issue SQL Query
			String sql=prop.getProperty("delete-query");
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			int delete=pstmt.executeUpdate();

			// 4th step: Read the result
			System.out.println(delete+"delete one rows");




		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {

			// Step 5: Closed all the JDBC objects
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
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


