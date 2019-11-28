package com.ustglobal.jdbcapp3;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class JdbcWithPropertiesInsert {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		FileReader reader=null;
		try {
			reader=new FileReader("text1.properties");
			Properties prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));

			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url,prop);
			String sql=prop.getProperty("insert-query");
			pstmt=conn.prepareStatement(sql);
			String empid=args[0];
			int id=Integer.parseInt(empid);
			pstmt.setInt(1,id);

			String name=args[1];
			pstmt.setString(2,name);

			String emsal=args[2];
			int sal=Integer.parseInt(emsal);
			pstmt.setInt(3,sal);

			String egender=args[3];
			pstmt.setString(4, egender);

			int count=pstmt.executeUpdate();

			// 4th step: Read the Result
			System.out.println(count + " Row(s) inserted");
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
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
