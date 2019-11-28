package com.ustglobal.jdbcapp3;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class InsertWithTryResource {
	public static void main(String[] args) {
		try(FileReader reader=new FileReader("text1.properties")){
			Properties prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			String url=prop.getProperty("url");
			String sql=prop.getProperty("insert-query");
			try(Connection conn=DriverManager.getConnection(url,prop);
					PreparedStatement pstmt=conn.prepareStatement(sql)){
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
				int insert=pstmt.executeUpdate();
				System.out.println(insert+ "inserted query");
			}


		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}


